import java.io.*; 
import java.util.*; 
import java.rmi.*;
import java.rmi.server.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Server extends UnicastRemoteObject implements ServerInterface {

    private static User currentUser;
    private static ArrayList<User> allUsers = new ArrayList<>();

    private final Lock _mutex = new ReentrantLock(true);
    private static final DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    
    public synchronized String calculator(int first, int second, char symbol) throws RemoteException {
        _mutex.lock();

        readUsers();
        Date date = new Date();
        System.out.println(currentUser.getUsername() + " request '" + symbol + "' calculation: " + sdf.format(date));

        String result = null;
        
        if(symbol == '+')
            result = String.valueOf(first + second);
        else if(symbol == '-')
            result = String.valueOf(first - second);
        else if(symbol == '*')
            result = String.valueOf(first * second);
        else {
            result = "Wrong calculation!";
            currentUser.setCredit(currentUser.getCredit() + 1);
        }

        currentUser.setCredit(currentUser.getCredit() - 1);
        

        writeUsers();
        _mutex.unlock();

        return result;
    }

    public boolean login(String username, String password){
        readUsers();

        boolean found = false;

        for (int i = 0; i < allUsers.size(); i++) {
            if(allUsers.get(i).getUsername().equals(username) && allUsers.get(i).getPassword().equals(password))
            {
                found = true;
                String t1 = allUsers.get(i).getUsername(),
                       t2 = allUsers.get(i).getPassword();
                int t3 = allUsers.get(i).getCredit();
                currentUser = new User(t1,t2,t3);
                Date date = new Date();
                System.out.println(currentUser.getUsername() + " is connected: " + sdf.format(date));
                break;
            }
        }

        return found;
    }

    public boolean register(String username, String password) {
        readUsers();

        for (int i = 0; i < allUsers.size(); i++) {
            if (username.equals(allUsers.get(i).getUsername())) {
                return false;
            }
        }

        currentUser = new User(username,password,10);
        allUsers.add(currentUser); // kullanıcı listesine eklendi
        Date date = new Date();
        System.out.println(currentUser.getUsername() + " have registered: " + sdf.format(date));
        writeUsers();
        return true;
    }

    public ArrayList<User> readUsers(){
        User temp = null;
        allUsers.clear();
        try {
            BufferedReader in = new BufferedReader(new FileReader("users.csv"));
            String line;
            while ( (line = in.readLine() ) != null) {
                String[] tokens = line.split(",");
                temp = new User(tokens[0],tokens[1],Integer.parseInt(tokens[2]));
                allUsers.add(temp);
            }
        }
        catch (Exception e) {
            System.out.println("98 " + e);
        }

        return allUsers;
    }

    public void writeUsers(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("users.csv", false));
            for (int i = 0; i < allUsers.size(); i++) {
                if(allUsers.get(i).getUsername().equals(currentUser.getUsername()))
                    allUsers.set(i,currentUser);

                String str =
                        allUsers.get(i).getUsername()+ "," +
                        allUsers.get(i).getPassword()+ "," +
                        allUsers.get(i).getCredit() +"\n";
                writer.write(str);
            }

            writer.close();
        }
        catch (IOException e)
        {
            System.out.println("118 " + e);
        }
    }

    public int getUserCredit(){
        return currentUser.getCredit();
    }

    public Server() throws RemoteException {
    }

    public static void main(String[] args) {
        try {
            ServerInterface service = new Server();
            System.out.println("SERVER READY!");
            Naming.rebind("calculator", service);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

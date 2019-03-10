import java.io.*; 
import java.util.*; 
import java.rmi.*;

public class Client {

    private static boolean loginStatus = false;

    public static void main (String[] args) {
        try {
            ServerInterface service = (ServerInterface) Naming.lookup("rmi://127.0.0.1/calculator");
            welcomePanel();

            if(loginStatus == true) {
                Scanner sc = new Scanner(System.in);

                if(service.getUserCredit() == 0) {
                    System.out.println("Sorry, you don't have enough credit to use calculator!");
                    System.out.println("You have " + service.getUserCredit() + " credits!");
                    
                }
                else {
                    System.out.print("Enter first operand: ");
                    int first = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter second operand: ");
                    int second = Integer.parseInt(sc.nextLine());

                    System.out.print("Select operation(+,-,*): ");
                    char operation = sc.nextLine().charAt(0);

                    String result = service.calculator(first,second,operation);

                    System.out.println(String.valueOf(first) + String.valueOf(operation) + String.valueOf(second) + "=" + result);
                    System.out.println("\nYou have " + service.getUserCredit() + " credits!\n");                    
                }
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private static void welcomePanel() {

        try {
            ServerInterface service = (ServerInterface) Naming.lookup("rmi://127.0.0.1/calculator");

            System.out.println("##############################");
            System.out.println("#        Calculator          #");
            System.out.println("##############################");
            System.out.println("# 1-login                    #");
            System.out.println("# 2-Register                 #");
            System.out.println("##############################");

            Scanner sc = new Scanner(System.in);

            int error, login = 0, userChoice = 3; //1-login 2-register 3-exit

            do {
                error = 0;
                try {
                    userChoice = Integer.parseInt(sc.nextLine());
                    if (userChoice < 1 || userChoice > 2){
                        System.out.println("Please enter a valid number!");
                        error = 1;
                    }
                } catch (Exception e) {
                    System.out.println("Please enter a valid number!");
                    sc.next(); //clear wrong input
                    error = 1;
                }
            } while (error == 1);


            if (userChoice == 1) { //LOGIN
                System.out.println("LOGIN");
                login = 1;

                System.out.println("Username: ");
                String username = sc.nextLine();

                System.out.println("Password: ");
                String password = sc.nextLine();

                loginStatus = service.login(username,password);
                if(loginStatus){
                    System.out.println("Success!");
                    System.out.println("\nYou have " + service.getUserCredit() + " credits!\n");
                }
                else
                    System.out.println("Fail!");
            }

            if (userChoice == 2 && login == 0) { //REGISTER
                System.out.println("REGISTER");
                String username = "", password = "";

                System.out.println("Username: ");
                username = sc.nextLine();

                System.out.println("Password: ");
                password = sc.nextLine();

                loginStatus = service.register(username,password);

                if(loginStatus)
                    System.out.println("Success!");
                else
                    System.out.println("Fail!");
            } 


        } catch(Exception ex) {
            ex.printStackTrace();
        }  
    }
}
import java.io.*; 
import java.util.*; 
import java.rmi.*;

public interface ServerInterface extends Remote {
    public String calculator(int first, int second, char symbol) throws RemoteException;
    public boolean login(String username, String password) throws RemoteException;
	public boolean register(String username, String password) throws RemoteException;
	public ArrayList<User> readUsers() throws RemoteException;
	public void writeUsers() throws RemoteException;
	public int getUserCredit() throws RemoteException;
}

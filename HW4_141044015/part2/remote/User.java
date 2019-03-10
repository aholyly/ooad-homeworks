public class User{

    /**
     * username of person
     */
    private String username;
    /**
     * password  of person
     */
    private String password;

    /**
     * credit  of person
     */
    private int credit;

    /**
     * no parameter constructor
     */
    public User(){}

    /**
     * Constructor with infos
     * @param username of user
     * @param password of user
     * @param credit of user
     */
    public User(String username, String password, int credit) {
        this.username = username;
        this.password = password;
        this.credit = credit;
    }

   
    public String getUsername() {
        return username;
    }
   
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
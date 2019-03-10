package part2;

/**
 * An implementation of email for personal emails
 */
public class PersonalEmail implements Email {

    private String name;
    private String address;

    /**
     * Construct name ane adress
     * @param personal
     * @param address
     */
    public PersonalEmail(String personal, String address) {
        this.name = personal;
        this.address = address;
    }

    /**
     * Print information of e-mail and its owner
     */
    @Override
    public void showEmailDetails() {
        System.out.println(name + " " + address);
    }
}

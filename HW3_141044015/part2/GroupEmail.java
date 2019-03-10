package part2;

import java.util.ArrayList;

/**
 * An implementation of e-mail for group e-mails
 * There can be a group in a group group.
 */
public class GroupEmail implements Email {

    private ArrayList<Email> emails;
    private String groupName;

    /**
     * Takes group adress and initialize ArrayList
     * @param groupAdress group name or group adress
     */
    public GroupEmail(String groupAdress) {
        this.groupName = groupAdress;
        emails = new ArrayList<>();
    }

    /**
     * Print information of e-mail and its owner or
     * Print group information and included e-mails
     */
    @Override
    public void showEmailDetails() {
        System.out.println(groupName + ":");
        for (Email e:emails) {
            e.showEmailDetails();
        }
        System.out.println();
    }

    /**
     * To add new e-mail
     * @param email email object
     * @return status
     */
    public boolean add(Email email) {
        return emails.add(email);
    }

    /**
     * To remove given email
     * @param email email object
     * @return status
     */
    public boolean remove(Email email) {
        return emails.remove(email);
    }

    /**
     * To get email of given index
     * @param index index
     * @return email object
     */
    public Email getChild(int index) {
        if(index >= emails.size())
            return null;

        return emails.get(index);
    }
}

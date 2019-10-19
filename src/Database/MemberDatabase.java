package Database;

import Members.Administrator;
import Members.User;
import java.util.HashMap;

public class MemberDatabase extends Database {

    private HashMap<String, User> users;
    private HashMap<String, Administrator> admins;
    private HashMap<String, User> members;

    public MemberDatabase() {
        users = new HashMap<>();
        admins = new HashMap<>();
        members = new HashMap<>();
    }

    public User findUser(String phoneNumber) {
        return find(phoneNumber, users);
    }

    public Administrator findAdmin(String phoneNumber) {
        return find(phoneNumber, admins);
    }

    public User findMember(String phoneNumber) {
        return find(phoneNumber, members);
    }

    public void addUser(User aUser) {
        add(aUser.getPhoneNumber(), aUser, users);
        members.put(aUser.getPhoneNumber(), aUser);
    }

    public void addAdmin(Administrator anAdministrator) {
        add(anAdministrator.getPhoneNumber(), anAdministrator, admins);
        members.put(anAdministrator.getPhoneNumber(), anAdministrator);
    }

    public void removeUser(String phoneNumber) {
        remove(phoneNumber, users);
        members.remove(phoneNumber);
    }

    public void removeAdmin(String phoneNumber) {
        remove(phoneNumber, admins);
        members.remove(phoneNumber);
    }

    public boolean alreadyStoredKey(String phoneNumber) {
        return checkKey(phoneNumber, members);
    }

}
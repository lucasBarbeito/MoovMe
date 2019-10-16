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

    public User findUser(String username) {
        return find(username, users);
    }

    public Administrator findAdmin(String username) {
        return find(username, admins);
    }

    public User findMember(String username) {
        return find(username, members);
    }

    public void addUser(String username, User aUser) {
        add(username, aUser, users);
        members.put(username, aUser);
    }

    public void addAdmin(String username, Administrator anAdministrator) {
        add(username, anAdministrator, admins);
        members.put(username, anAdministrator);
    }

    public void removeUser(String username) {
        remove(username, users);
        members.remove(username);
    }

    public void removeAdmin(String username) {
        remove(username, admins);
        members.remove(username);
    }

    /*
    public void printData() {
        for (User aUser : hashmap.values()) {
            System.out.println(aUser.getUsername() + " // " + aUser.getPhoneNumber() + " // isBlocked: " + aUser.getBlockedStatus());
        }
    }
    */

}

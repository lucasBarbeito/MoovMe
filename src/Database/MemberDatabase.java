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

    public void addUser(User aUser) {
        add(aUser.getUsername(), aUser, users);
        members.put(aUser.getUsername(), aUser);
    }

    public void addAdmin(Administrator anAdministrator) {
        add(anAdministrator.getUsername(), anAdministrator, admins);
        members.put(anAdministrator.getUsername(), anAdministrator);
    }

    public void removeUser(String username) {
        remove(username, users);
        members.remove(username);
    }

    public void removeAdmin(String username) {
        remove(username, admins);
        members.remove(username);
    }

}

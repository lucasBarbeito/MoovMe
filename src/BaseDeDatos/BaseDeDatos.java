package BaseDeDatos;

import Members.User;

import java.util.ArrayList;

public class BaseDeDatos {

    static private ArrayList<User> users = new ArrayList<>(100);

    public static void addUser(User user) {
        users.add(user);
    }

    public static void removeUser(User user) {
        users.remove(user);
    }

}

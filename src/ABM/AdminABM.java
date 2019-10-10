package ABM;

import Database.*;
import Members.*;

public class AdminABM {

    private UserDatabase userDatabase;
    private AdminDatabase adminDatabase;

    public AdminABM(UserDatabase userDatabase, AdminDatabase adminDatabase) {
        this.userDatabase = userDatabase;
        this.adminDatabase = adminDatabase;
    }

    public void removeFromABM(String username) {
        Administrator anAdmin = adminDatabase.find(username);
        adminDatabase.remove(username);
        User aUser= new User(anAdmin.getUsername(), anAdmin.getPhoneNumber());
        userDatabase.add(username, aUser);
    }

    public void addToABM(String username) {
        User aUser = userDatabase.find(username);
        userDatabase.remove(username);
        Administrator anAdmin = new Administrator(aUser.getUsername(), aUser.getPhoneNumber(), this, userDatabase);
        adminDatabase.add(username, anAdmin);
    }

}
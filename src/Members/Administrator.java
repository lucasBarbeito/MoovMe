package Members;

import ABM.AdminABM;
import Database.UserDatabase;

public class Administrator extends User {

    private AdminABM adminABM;
    private UserDatabase userDatabase;

    public Administrator(String username, String phoneNumber, AdminABM adminABM, UserDatabase userDatabase){
        super(username, phoneNumber);
        this.adminABM = adminABM;
        this.userDatabase = userDatabase;
    }

    public void blockUser(String username) {
        userDatabase.find(username).blockedStatus = true;
    }

    public void unblockUser(String username) {
        userDatabase.find(username).blockedStatus = false;
    }

    public void upgradeToAdmin(String username) {
        adminABM.addToABM(username);
    }

    public void downgradeToUser(String username) {
        adminABM.removeFromABM(username);
    }


}

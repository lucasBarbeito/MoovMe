package Manager;

import Database.*;
import Members.*;
import Registration.Registrator;

public class UserManager {

    private MemberDatabase aMemberDatabase;
    private Registrator aRegistrator;

    public UserManager(MemberDatabase aMemberDatabase, Registrator aRegistrator) {
        this.aMemberDatabase = aMemberDatabase;
        this.aRegistrator = aRegistrator;
    }

    public void removeFromABM(String username) {
        Administrator anAdmin = aMemberDatabase.findAdmin(username);
        aMemberDatabase.removeAdmin(username);
        aRegistrator.registerUser(anAdmin.getUsername(), anAdmin.getPhoneNumber());
    }

    public void addToABM(String username) {
        User aUser = aMemberDatabase.findUser(username);
        aMemberDatabase.removeUser(username);
        aRegistrator.registerAdmin(aUser.getUsername(), aUser.getPhoneNumber(), this);
    }

    public void blockUser(String username) {
        User aUser = aMemberDatabase.findMember(username);
        if(aUser.getBlockedStatus()) {
            return;
        } else {
            aUser.changeBlockedStatus();
        }
    }

    public void unblockUser(String username) {
        User aUser = aMemberDatabase.findMember(username);
        if(!aUser.getBlockedStatus()) {
            return;
        } else {
            aUser.changeBlockedStatus();
        }
    }

}
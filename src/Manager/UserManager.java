package Manager;

import Database.*;
import Members.*;

public class UserManager {

    private MemberDatabase aMemberDatabase;

    public UserManager(MemberDatabase aMemberDatabase) {
        this.aMemberDatabase = aMemberDatabase;
    }

    public void upgradeToAdmin(String phoneNumber, TerminalManager aTerminalManager, ZoneManager aZoneManager) {
        User aUser = aMemberDatabase.findUser(phoneNumber);
        aMemberDatabase.removeUser(phoneNumber);
        registerAdmin(aUser, this, aTerminalManager, aZoneManager);
    }

    public void downgradeToUser(String phoneNumber) {
        Administrator anAdmin = aMemberDatabase.findAdmin(phoneNumber);
        aMemberDatabase.removeAdmin(phoneNumber);
        registerUser(anAdmin.getUsername(), anAdmin.getPhoneNumber());
    }

    private void registerUser(String username, String phoneNumber) {
        User newUser = new User(username, phoneNumber);
        aMemberDatabase.addUser(newUser);
    }

    private void registerAdmin(User aUser, UserManager userManager, TerminalManager aTerminalManager, ZoneManager aZoneManager) {
        Administrator newAdmin = new Administrator(aUser, userManager, aTerminalManager, aZoneManager);
        aMemberDatabase.addAdmin(newAdmin);
    }

    public void blockUser(String phoneNumber) {
        User aUser = aMemberDatabase.findUser(phoneNumber);
        aUser.blockUser();
    }

    public void unblockUser(String phoneNumber) {
        User aUser = aMemberDatabase.findUser(phoneNumber);
        aUser.unblockUser();
    }

    public User getMember(String phoneNumber) {
        return aMemberDatabase.findMember(phoneNumber);
    }

}
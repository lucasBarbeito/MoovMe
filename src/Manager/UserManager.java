package Manager;

import Database.*;
import Members.*;

public class UserManager {

    private MemberDatabase aMemberDatabase;

    public UserManager(MemberDatabase aMemberDatabase) {
        this.aMemberDatabase = aMemberDatabase;
    }

    public void removeFromABM(String phoneNumber) {
        Administrator anAdmin = aMemberDatabase.findAdmin(phoneNumber);
        aMemberDatabase.removeAdmin(phoneNumber);
        registerUser(anAdmin.getUsername(), anAdmin.getPhoneNumber());
    }

    private void registerUser(String username, String phoneNumber) {
        User newUser = new User(username, phoneNumber);
        if (aMemberDatabase.alreadyStoredKey(phoneNumber)) {
            throw new RuntimeException("This number is already registered.");
        } else {
            aMemberDatabase.addUser(newUser);
        }
    }

    public void addToABM(String phoneNumber, TerminalManager aTerminalManager, ZoneDatabase aZoneDatabase) {
        User aUser = aMemberDatabase.findUser(phoneNumber);
        aMemberDatabase.removeUser(phoneNumber);
        registerAdmin(aUser, this, aTerminalManager, aZoneDatabase);
    }

    private void registerAdmin(User aUser, UserManager userManager, TerminalManager aTerminalManager, ZoneDatabase aZoneDatabase) {
        Administrator newAdmin = new Administrator(aUser, userManager, aTerminalManager, aZoneDatabase);
        aMemberDatabase.addAdmin(newAdmin);
    }

    public void blockUser(String phoneNumber) {
        User aUser = aMemberDatabase.findMember(phoneNumber);
        aUser.blockUser();

    }

    public void unblockUser(String phoneNumber) {
        User aUser = aMemberDatabase.findMember(phoneNumber);
        aUser.unBlockUser();
    }

    public User getMember(String phoneNumber) {
        return aMemberDatabase.findMember(phoneNumber);
    }

}
package Manager;

import Database.*;
import Members.*;
import IdGenerator.IdGenerator;

public class UserManager {

    private MemberDatabase aMemberDatabase;
    private IdGenerator anIdGenerator; // todo: creo que se puede quitar esta variable, no se usa, revisar bien

    public UserManager(MemberDatabase aMemberDatabase, IdGenerator anIdGenerator) {
        this.aMemberDatabase = aMemberDatabase;
        this.anIdGenerator = anIdGenerator;
    }

    public void removeFromABM(String phoneNumber) {
        Administrator anAdmin = aMemberDatabase.findAdmin(phoneNumber);
        aMemberDatabase.removeAdmin(phoneNumber);
        registerUser(anAdmin.getUsername(), anAdmin.getPhoneNumber(), anAdmin.getTerminalDatabase());
    }

    private void registerUser(String username, String phoneNumber, TerminalDataBase aTerminalDatabase) {
        User newUser = new User(username, phoneNumber, aTerminalDatabase);
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
        if(!aUser.getBlockedStatus()) {
            aUser.changeBlockedStatus();
        }
    }

    public void unblockUser(String phoneNumber) {
        User aUser = aMemberDatabase.findMember(phoneNumber);
        if(aUser.getBlockedStatus()) {
            aUser.changeBlockedStatus();
        }
    }

    public User getMember(String phoneNumber) {
        return aMemberDatabase.findMember(phoneNumber);
    }

}
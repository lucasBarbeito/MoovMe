package Manager;

import Database.*;
import Members.*;
import IdGenerator.IdGenerator;

public class UserManager {

    private MemberDatabase aMemberDatabase;
    private IdGenerator anIdGenerator;

    public UserManager(MemberDatabase aMemberDatabase, IdGenerator anIdGenerator) {
        this.aMemberDatabase = aMemberDatabase;
        this.anIdGenerator = anIdGenerator;
    }

    public void removeFromABM(String username) {
        Administrator anAdmin = aMemberDatabase.findAdmin(username);
        aMemberDatabase.removeAdmin(username);
        registerUser(anAdmin.getUsername(), anAdmin.getPhoneNumber());
    }

    public void addToABM(String username, TerminalDataBase aTerminalDataBase) {
        User aUser = aMemberDatabase.findUser(username);
        aMemberDatabase.removeUser(username);
        registerAdmin(aUser.getUsername(), aUser.getPhoneNumber(), this, aTerminalDataBase);
    }

    public void blockUser(String username) {
        User aUser = aMemberDatabase.findMember(username);
        if(!aUser.getBlockedStatus()) {
            aUser.changeBlockedStatus();
        }
    }

    public void unblockUser(String username) {
        User aUser = aMemberDatabase.findMember(username);
        if(aUser.getBlockedStatus()) {
            aUser.changeBlockedStatus();
        }
    }

    private void registerUser(String username, String phoneNumber) {
        User newUser = new User(username, phoneNumber);
        if (aMemberDatabase.alreadyStoredKey(phoneNumber)) {
            throw new RuntimeException("This number is already registered.");
        } else {
            aMemberDatabase.addUser(newUser);
        }
    }

    private void registerAdmin(String username, String phoneNumber, UserManager userManager, TerminalDataBase aTerminalDataBase) {
        Administrator newAdmin = new Administrator(new User(username, phoneNumber), userManager,
                new TerminalManager(aTerminalDataBase, anIdGenerator));
        aMemberDatabase.addAdmin(newAdmin);
    }

}
package Registration;

import Manager.TerminalManager;
import Manager.UserManager;
import Database.MemberDatabase;
import Database.TerminalDataBase;
import Members.Administrator;
import Members.User;

public class Registrator {

    private MemberDatabase aMemberDatabase;
    private IdGenerator anIdGenerator;
    private TerminalDataBase aTerminalDataBase;

    public Registrator(MemberDatabase aMemberDatabase, IdGenerator anIdGenerator, TerminalDataBase aTerminalDataBase) {
        this.aMemberDatabase = aMemberDatabase;
        this.anIdGenerator = anIdGenerator;
        this.aTerminalDataBase = aTerminalDataBase;
    }

    public void registerUser(String username, String phoneNumber) {
        User newUser = new User(username, phoneNumber);
        aMemberDatabase.addUser(newUser);
    }

    public void registerAdmin(String username, String phoneNumber, UserManager userManager) {
        Administrator newAdmin = new Administrator(new User(username, phoneNumber), userManager,
                                                   new TerminalManager(aTerminalDataBase, anIdGenerator));
        aMemberDatabase.addAdmin(newAdmin);
    }

}
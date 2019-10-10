package Members;

import ABM.AdminABM;
import ABM.TerminalABM;
import Database.UserDatabase;
import IDGenerator.IdGenerator;
import Zone.Terminal;
import Zone.Zone;

public class Administrator extends User {

    private AdminABM adminABM;
    private UserDatabase userDatabase;
    private TerminalABM terminalABM;

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

    public void createTerminal(String zoneName) {
        Terminal newTerminal = new Terminal(new Zone(zoneName), IdGenerator.getNewTerminalId());
        terminalABM.addToABM(newTerminal);
    }


}

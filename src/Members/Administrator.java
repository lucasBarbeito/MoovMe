package Members;

import ABM.AdminABM;
import ABM.TerminalABM;
import Database.MemberDatabase;
import Database.VehicleDatabase;
import IDGenerator.IdGenerator;
import Zone.Terminal;
import Zone.Zone;

public class Administrator extends User {

    private AdminABM adminABM;
    private MemberDatabase memberDatabase;
    private VehicleDatabase vehicleDatabase;
    private TerminalABM terminalABM;

    public Administrator(String username, String phoneNumber, AdminABM adminABM, MemberDatabase memberDatabase, VehicleDatabase vehicleDatabase){
        super(username, phoneNumber);
        this.adminABM = adminABM;
        this.memberDatabase = memberDatabase;
        this.vehicleDatabase = vehicleDatabase;
    }

    public void blockUser(String username) {
        memberDatabase.findMember(username).blockedStatus = true;
    }

    public void unblockUser(String username) {
        memberDatabase.findMember(username).blockedStatus = false;
    }

    public void upgradeToAdmin(String username) {
        adminABM.addToABM(username);
    }

    public void downgradeToUser(String username) {
        adminABM.removeFromABM(username);
    }

    public void createTerminal(String zoneName) {
        Terminal newTerminal = new Terminal(new Zone(zoneName), IdGenerator.getNewTerminalId(), vehicleDatabase);
        terminalABM.addToABM(newTerminal);
    }





}

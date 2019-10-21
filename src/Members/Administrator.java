package Members;

import Database.TerminalDataBase;
import Database.ZoneDatabase;
import Manager.UserManager;
import Manager.TerminalManager;

public class Administrator extends User {

    private UserManager anUserManager;
    private TerminalManager aTerminalManager;
    private ZoneDatabase aZoneDatabase;

    public Administrator(User aUser, UserManager anUserManager, TerminalManager aTerminalManager, ZoneDatabase aZoneDatabase) {
        super(aUser.getUsername(), aUser.getPhoneNumber(), aTerminalManager.getTerminalDataBase());
        this.anUserManager = anUserManager;
        this.aTerminalManager = aTerminalManager;
        this.aZoneDatabase = aZoneDatabase;
    }

    public void upgradeToAdmin(String phoneNumber) {
        anUserManager.addToABM(phoneNumber, aTerminalManager, aZoneDatabase);
    }

    public void downgradeToUser(String phoneNumber) {
        // todo: que un admin no se pueda downgradear el mismo, para evitar que dejen de haber admins
        anUserManager.removeFromABM(phoneNumber);
    }

    private void blockUser(String phoneNumber) {
        // todo: que un admin no se pueda bloquear el mismo, para evitar que dejen de haber admins
        anUserManager.blockUser(phoneNumber);
    }

    public void unblockUser(String phoneNumber) {
        anUserManager.unblockUser(phoneNumber);
    }

    public void createBicycleLot(int numberOfBicycles, String zoneName) {
        aTerminalManager.newBicycleLot(numberOfBicycles, aZoneDatabase.findZone(zoneName));
    }

    public void createScooterLot(int numberOfScooters, String zoneName) {
        aTerminalManager.newScooterLot(numberOfScooters, aZoneDatabase.findZone(zoneName));
    }

    public void createTerminal(String zoneName, double discountPerPoint) {
        aTerminalManager.addTerminal(zoneName, discountPerPoint);
    }

    public void securityThreat(String phoneNumber) {
        blockUser(phoneNumber);
        User aUser = anUserManager.getMember(phoneNumber);
        aUser.payment();
    }

    public TerminalDataBase getTerminalDatabase() {
        return aTerminalManager.getTerminalDataBase();
    }

}

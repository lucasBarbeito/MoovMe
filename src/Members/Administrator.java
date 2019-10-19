package Members;

import Manager.UserManager;
import Manager.TerminalManager;

public class Administrator extends User {

    private UserManager anUserManager;
    private TerminalManager aterminalManager;

    public Administrator(User aUser, UserManager anUserManager, TerminalManager aterminalManager) {
        super(aUser.getUsername(), aUser.getPhoneNumber());
        this.anUserManager = anUserManager;
        this.aterminalManager = aterminalManager;
    }

    public void upgradeToAdmin(String username) {
        anUserManager.addToABM(username, aterminalManager.getTerminalDataBase());
    }

    public void downgradeToUser(String username) {
        anUserManager.removeFromABM(username);
    }

    public void blockUser(String username) {
        anUserManager.blockUser(username);
    }

    public void unblockUser(String username) {
        anUserManager.unblockUser(username);
    }

    public void createBicycleLot(int numberOfBicycles) {
        aterminalManager.newBicycleLot(numberOfBicycles);
    }

    public void createScooterLot(int numberOfScooters) {
        aterminalManager.newScooterLot(numberOfScooters);
    }

    public void createTerminal(String zoneName, double discountPerPoint) {
        aterminalManager.addTerminal(zoneName, discountPerPoint);
    }

}

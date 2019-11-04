package Members;

import Assets.Bicycle;
import Assets.Scooter;
import Manager.ZoneManager;
import Database.TerminalDatabase;
import Manager.UserManager;
import Manager.TerminalManager;

public class Administrator extends User {

    private UserManager anUserManager;
    private TerminalManager aTerminalManager;
    private ZoneManager aZoneManager;

    public Administrator(User aUser, UserManager anUserManager, TerminalManager aTerminalManager, ZoneManager aZoneManager) {
        super(aUser.getUsername(), aUser.getPhoneNumber());
        this.anUserManager = anUserManager;
        this.aTerminalManager = aTerminalManager;
        this.aZoneManager = aZoneManager;
    }

    public void upgradeToAdmin(String phoneNumber) {
        anUserManager.upgradeToAdmin(phoneNumber, aTerminalManager, aZoneManager);
    }

    public void downgradeToUser(String phoneNumber) {
        if(!phoneNumber.equals(this.getPhoneNumber())) {
            anUserManager.downgradeToUser(phoneNumber);
        }
    }

    private void blockUser(String phoneNumber) {
        if(!phoneNumber.equals(this.getPhoneNumber())) {
            anUserManager.blockUser(phoneNumber);
        }
    }

    public void unblockUser(String phoneNumber) {
        anUserManager.unblockUser(phoneNumber);
    }

    public void createBicycleLot(int numberOfBicycles, String zoneName, int terminalId) {
        aTerminalManager.newBicycleLot(numberOfBicycles, aZoneManager.getAZoneDatabase().findZone(zoneName), terminalId);
    }

    public void createScooterLot(int numberOfScooters, String zoneName,  int terminalId) {
        aTerminalManager.newScooterLot(numberOfScooters, aZoneManager.getAZoneDatabase().findZone(zoneName), terminalId);
    }

    public void createTerminal(String zoneName) {
        aTerminalManager.addTerminal(aZoneManager.getAZoneDatabase().findZone(zoneName));
    }

    public void securityThreat(String phoneNumber) {
        blockUser(phoneNumber);
        User aUser = anUserManager.getMember(phoneNumber);
        //aUser.endTrip();
        //aUser.payment();
    }

    public TerminalDatabase getTerminalDatabase() {
        return aTerminalManager.getTerminalDataBase();
    }

    public void changeBicycleMinimumDiscountScore(String zoneName, double newMinimumDiscountScore) {
        aZoneManager.changeMinimumDiscountScore(zoneName, Bicycle.BICYCLE, newMinimumDiscountScore);
    }

    public void changeBicycleDiscountPercentage(String zoneName, int typeOfVehicle, double newDiscountPercentage) {
        aZoneManager.changeDiscountPercentage(zoneName, Bicycle.BICYCLE, newDiscountPercentage);
    }

    public void changeScooterMinimumDiscountScore(String zoneName, double newMinimumDiscountScore) {
        aZoneManager.changeMinimumDiscountScore(zoneName, Scooter.SCOOTER, newMinimumDiscountScore);
    }

    public void changeScooterDiscountPercentage(String zoneName, int typeOfVehicle, double newDiscountPercentage) {
        aZoneManager.changeDiscountPercentage(zoneName, Scooter.SCOOTER, newDiscountPercentage);
    }

}

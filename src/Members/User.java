package Members;

import Database.TerminalDataBase;
import IDGenerator.IdGenerator;
import ScorePoints.ScorePoint;
import Vehicles.Vehicle;
import Zone.Terminal;

import java.util.HashMap;

public class User {

    private String username, phoneNumber;
    boolean blockedStatus;
    private TerminalDataBase terminalDataBase;
    private Vehicle vehicleInUse;
    private HashMap<Integer, ScorePoint> points = new HashMap<>();

    public User(String username, String phoneNumber){
        this.username = username;
        this.phoneNumber = phoneNumber;
        blockedStatus = false;
    }

    public String getUsername() {
        return username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean getBlockedStatus() { return blockedStatus; }

    //

    public void startTrip(int terminalId, int vehicleId) {
        Terminal aTerminal = terminalDataBase.findTerminal(terminalId);
        vehicleInUse = aTerminal.takeOutVehicle(vehicleId);
    }

}
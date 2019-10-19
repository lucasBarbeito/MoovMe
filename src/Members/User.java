package Members;

import ScorePoints.ScorePoint;
import Vehicles.Vehicle;

import java.util.HashMap;

public class User {

    private String username, phoneNumber;
    private boolean blocked;
    private Vehicle vehicleInUse;
    private HashMap<Integer, ScorePoint> points = new HashMap<>();

    public User(String username, String phoneNumber){
        this.username = username;
        this.phoneNumber = phoneNumber;
        blocked = false;
    }

    public String getUsername() {
        return username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean getBlockedStatus() {
        return blocked;
    }

    public void changeBlockedStatus() {
        blocked = !blocked;
    }

}
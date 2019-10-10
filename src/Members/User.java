package Members;

import IDGenerator.IdGenerator;
import ScorePoints.ScorePoint;
import Trip.Trip;
import Zone.Terminal;

import java.util.HashMap;

public class User {

    protected String username, phoneNumber;
    protected boolean blockedStatus;
    HashMap<Integer, ScorePoint> points = new HashMap<Integer, ScorePoint>();
    private Trip trip;

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

    public void startTrip() {

    }

    public Trip getTrip() {
        return trip;
    }
}
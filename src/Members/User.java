package Members;

import ScorePoints.ScorePoint;
import Trip.Trip;

import java.time.LocalTime;
import java.util.HashMap;

public class User {

    private String username, phoneNumber;
    private boolean isUserBlocked, isUserTraveling;
    private double moneySpent;
    private Trip aUserTrip;
    private HashMap<String, ScorePoint> userPoints;

    public User(String username, String phoneNumber){
        this.username = username;
        this.phoneNumber = phoneNumber;
        isUserBlocked = false;
        isUserTraveling = false;
        moneySpent = 0;
    }

    public String getUsername() {
        return username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean getBlockedStatus() {
        return isUserBlocked;
    }

    public ScorePoint getUserPoints(String zoneName) {
        return userPoints.get(zoneName);
    }

    /*
    public void changeBlockedStatus() {
        isUserBlocked = !isUserBlocked;
    }
    */

    public void blockUser() {
        isUserBlocked = true;
    }

    public void unblockUser() {
        isUserBlocked = false;
    }

    public void startTrip(int terminalId, int vehicleId) {
        //String tripMessage = aUserApp.startTrip(terminalId, vehicleId);
        //System.out.println(tripMessage);
        if(isUserBlocked) {
            System.out.println("You can't start a trip. You're blocked!");
        }
        aUserTrip = new Trip(this, terminalId, vehicleId, LocalTime.now());
        isUserTraveling = true;
        System.out.println("Trip started successfully!");
    }

    public void endTrip(int terminalId) {
        //String tripMessage = aUserApp.endTrip(terminalId);
        //System.out.println(tripMessage);
        if(isUserTraveling) {
            aUserTrip.endGoodTrip(terminalId);
            isUserTraveling = false;
            System.out.println("Thank you for using MoovMe. Have a great day!");
        }
        System.out.println("Sorry can't end a trip. You're not traveling");
    }

    public void payTrip(double moneyToPay) {
        this.moneySpent += moneyToPay;
    }

    public void addPoints(String zoneName, double points) {
        userPoints.get(zoneName).addPoints(points);
    }

    public void addScoreboard(String zoneName) {
        userPoints.put(zoneName, new ScorePoint(zoneName, username));
    }

    public boolean firstTimeInZone(String zoneName) {
        return userPoints.containsKey(zoneName);
    }

}
package Members;

import ScorePoints.ScorePoint;
import Trip.Trip;
import Vehicles.Vehicle;
import Date.Date;
import Zone.Zone;

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

    public void startTrip(int vehicleId, Zone zone) {
        Vehicle vehicle = zone.checkForVehicleInZone(vehicleId);
        trip = new Trip(Date.getInstantTime(), this, vehicle, zone);
    }

    public void finishTrip(int terminalId){
        trip.setEndTime();
        trip.getZone().saveVehicleInTerminal(trip.getVehicle(), terminalId);
    }

    public Trip getTrip() {
        return trip;
    }
}
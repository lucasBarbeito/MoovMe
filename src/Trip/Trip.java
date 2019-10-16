package Trip;

import Date.Date;
import Members.User;
import Vehicles.Vehicle;
import Zone.Zone;

public class Trip {

    private Date startTime, endTime;
    private User user;
    private Vehicle vehicle;
    private int duration;
    private Zone zone;

    public Trip(Date startTime, User user, Vehicle vehicle, Zone zone) {
        this.startTime = startTime;
        this.user = user;
        this.vehicle = vehicle;
        this.zone = zone;
    }

    public Zone getZone() {
        return zone;
    }

    public void setEndTime() {
        this.endTime = Date.getInstantTime();
        duration = startTime.diferenceInMinutes(endTime);
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public User getUser() {
        return user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getDuration() {
        return duration;
    }


}

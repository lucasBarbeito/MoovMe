package Trip;

import Date.Date;
import Members.User;
import Vehicles.Vehicle;

public class Trip {

    private Date startTime, endTime;
    private User user;
    private Vehicle vehicle;
    private int duration;

    public Trip(Date startTime, User user, Vehicle vehicle) {
        this.startTime = startTime;
        this.user = user;
        this.vehicle = vehicle;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
        duration = startTime.diferenceInMinutes(endTime);
    }

    public int getDuration() {
        return duration;
    }


}

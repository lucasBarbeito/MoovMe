package Trip;

import Members.User;
import Vehicles.Terminal;
import Vehicles.Vehicle;

public class Trip {

    private User aUser;
    private Vehicle aVehicle;
    private Terminal aTerminal;
    private Date startTime, endTime;
    private int duration;

    public Trip(User aUser, Terminal aTerminal, Vehicle aVehicle/*, startTime */) {
        this.aUser = aUser;
        this.aTerminal = aTerminal;
        this.aVehicle = aVehicle;
        //this.startTime = startTime;
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
        return aUser;
    }

    public Vehicle getVehicle() {
        return aVehicle;
    }

    public int getDuration() {
        return duration;
    }


}

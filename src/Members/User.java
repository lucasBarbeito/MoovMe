package Members;

import ScorePoints.ScorePoint;
import Vehicles.Vehicle;

import java.util.HashMap;

public class User {

    protected String firstName, lastName, phoneNumber, userName;
    protected int userId;
    HashMap<Integer, ScorePoint> points = new HashMap<Integer, ScorePoint>();

    public User(String firstName, String lastName, String phoneNumber, int userId, String userName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.userId = userId;
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public int getUserId() {
        return userId;
    }
    public String getUserName() {
        return userName;
    }

    public String toString(){
        return userId + ", " + firstName + ", " + lastName + ", " + phoneNumber + ", " + userName;
    }

    public void takeAVehicle(Vehicle vehicle){


    }

}

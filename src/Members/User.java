package Members;

import ScorePoints.ScorePoint;

import java.awt.*;
import java.util.HashMap;

public class User {

    protected String firstName, lastName, userName, phoneNumber;
    private boolean isBlocked;
    HashMap<Integer, ScorePoint> points = new HashMap<Integer, ScorePoint>();

    public User(String firstName, String lastName, String userName, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        isBlocked = false;
    }

    public String getFirstName() { return firstName;}
    public String getLastName() {
        return lastName;
    }
    public String getUserName() {
        return userName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

}

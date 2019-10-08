package Members;

import ScorePoints.ScorePoint;

import java.awt.*;
import java.util.HashMap;

public class User {

    protected String firstName, lastName, userName, password, phoneNumber;
    protected boolean adminStatus;
    private boolean isBlocked;
    HashMap<Integer, ScorePoint> points = new HashMap<Integer, ScorePoint>();

    public User(String firstName, String lastName, String userName, String password, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        adminStatus = false;
        isBlocked = false;
    }

    public String getFirstName() { return firstName;}
    public String getLastName() {
        return lastName;
    }
    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

}

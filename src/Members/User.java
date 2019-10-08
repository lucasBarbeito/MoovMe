package Members;

import ScorePoints.ScorePoint;

import java.awt.*;
import java.util.HashMap;

public class User {

    protected String firstName, lastName, phoneNumber;
    HashMap<Integer, ScorePoint> points = new HashMap<Integer, ScorePoint>();

    public User(String firstName, String lastName, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() { return firstName;}
    public String getLastName() {
        return lastName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

}

package Members;

import ScorePoints.ScorePoint;

import java.util.HashMap;

public class User {

    protected String firstName, lastName, phoneNumber;
    protected int userId;
    HashMap<Integer, ScorePoint> points = new HashMap<Integer, ScorePoint>();

    public User(String firstName, String lastName, String phoneNumber, int userId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.userId = userId;
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

    public String toString(){
        return userId+", "+firstName+", "+lastName+", "+phoneNumber;
    }

}
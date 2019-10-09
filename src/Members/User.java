package Members;

import IDGenerator.IdGenerator;
import ScorePoints.ScorePoint;

import java.util.HashMap;

public class User {

    protected String userName, phoneNumber;
    protected int userId;
    HashMap<Integer, ScorePoint> points = new HashMap<Integer, ScorePoint>();

    public User(String userName, String phoneNumber, int userId){
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getUserId() {
        return userId;
    }

    public String toString() {
        return userId+", "+phoneNumber;
    }

}
package ScorePoints;

import java.io.Serializable;

public class ScorePoint implements Comparable{

    int totalPoints;
    String zoneName, userName;

    public ScorePoint(int totalPoints, String zoneName, String userName) {
        this.totalPoints = totalPoints;
        this.zoneName = zoneName;
        this.userName = userName;
    }

    public String getZoneName() {
        return zoneName;
    }

    public String getUserName() {
        return userName;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    void addPoints(int point){
        totalPoints += point;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof ScorePoint){
            return totalPoints - ((ScorePoint) o).getTotalPoints();
        }
        throw new RuntimeException();
    }
}

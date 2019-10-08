package ScorePoints;

public class ScorePoint {

    int zoneId, userId, totalPoints;

    public ScorePoint(int zoneId, int userId, int totalPoints) {
        this.zoneId = zoneId;
        this.userId = userId;
        this.totalPoints = totalPoints;
    }

    public int getZoneId() {
        return zoneId;
    }

    public int getUserId() {
        return userId;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    void addPoints(int point){
        totalPoints += point;
    }
}

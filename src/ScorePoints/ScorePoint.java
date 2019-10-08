package ScorePoints;

public class ScorePoint {

    int zoneId, totalPoints;

    public ScorePoint(int zoneId, int totalPoints) {
        this.zoneId = zoneId;
        this.totalPoints = totalPoints;
    }

    public int getZoneId() {
        return zoneId;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    void addPoints(int point){
        totalPoints += point;
    }
}

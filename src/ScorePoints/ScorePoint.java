package ScorePoints;

public class ScorePoint {

    private double totalMonthlyPoints, pointsForDiscount;
    private String zoneName, username;

    public ScorePoint(String zoneName, String username) {
        this.totalMonthlyPoints = 0;
        this.pointsForDiscount = 0;
        this.zoneName = zoneName;
        this.username = username;
    }

    public String getZoneName() {
        return zoneName;
    }

    public String getUsername() {
        return username;
    }

    public double getTotalMonthlyPoints() {
        return totalMonthlyPoints;
    }

    public double getPointsForDiscount() {
        return pointsForDiscount;
    }

    public void addPoints(double points){
        changePoints(points);
        totalMonthlyPoints += points;
    }

    public void removePoints(double points){
        changePoints(-points);
    }

    private void changePoints(double points) {
        pointsForDiscount += points;
    }


}

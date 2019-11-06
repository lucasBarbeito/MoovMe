package ScorePoints;

public class ScorePoint {

    private double totalMonthlyPoints, pointsForDiscount;
    private String zoneName, username;
    private boolean monthlyTop3;

    public ScorePoint(String zoneName, String username) {
        this.totalMonthlyPoints = 0;
        this.pointsForDiscount = 0;
        this.zoneName = zoneName;
        this.username = username;
        monthlyTop3 = false;
    }

    String getZoneName() {
        return zoneName;
    }

    String getUsername() {
        return username;
    }

    double getTotalMonthlyPoints() {
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

    public void makeMonthlyTop3() {
        monthlyTop3 = true;
    }

    public void resetMonthlyTop3() {
        monthlyTop3 = false;
    }

    public boolean isMonthlyTop3() {
        return monthlyTop3;
    }

}

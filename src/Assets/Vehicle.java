package Assets;

import ScorePoints.ScorePoint;

public abstract class Vehicle {

    private Zone vehicleZone;
    private int vehicleId, LotId;
    double vehicleFare, vehicleTripScore, vehiclePenaltyFee;

    Vehicle(int vehicleId, int LotId, Zone vehicleZone) {
        this.vehicleId = vehicleId;
        this.LotId = LotId;
        this.vehicleZone = vehicleZone;
    }

    public abstract double getVehicleFare(ScorePoint userPoints);

    public double getVehicleFare(ScorePoint userPoints, double minimumDiscountScore, double discountPercentage) {
        if(userPoints.getPointsForDiscount() >= minimumDiscountScore) {
            userPoints.removePoints(minimumDiscountScore);
            return vehicleFare * discountPercentage;
        }
        return vehicleFare;
    }

    public  double getVehiclePenaltyFee() {
        return vehiclePenaltyFee;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public Zone getVehicleZone() {
        return vehicleZone;
    }

    public double getVehicleTripScore() {
        return vehicleTripScore;
    }

}

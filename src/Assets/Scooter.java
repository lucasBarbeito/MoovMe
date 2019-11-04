package Assets;

import ScorePoints.ScorePoint;

public class Scooter extends Vehicle {

    private static final double SCOOTER_TRIP_COST = 1.00;      // per minute
    private static final double SCOOTER_TRIP_SCORE = 20;       // per trip
    private static final double SCOOTER_PENALTY_FEE = 2000;
    public static final int SCOOTER = 2;
    private static double scooterMinimumDiscountScore;
    private static double scooterDiscountPercentage;

    public Scooter(int vehicleId, int vehicleLotId, Zone vehicleZone) {
        super(vehicleId, vehicleLotId, vehicleZone);
        vehicleFare = vehicleZone.getZoneCost() * SCOOTER_TRIP_COST;
        vehicleTripScore = SCOOTER_TRIP_SCORE;
        vehiclePenaltyFee = SCOOTER_PENALTY_FEE;
        scooterMinimumDiscountScore = vehicleZone.getMinimumDiscountScore(SCOOTER);
        scooterDiscountPercentage = vehicleZone.getDiscountPercentage(SCOOTER);
    }

    public double getVehicleFare(ScorePoint userPoints) {
        return super.getVehicleFare(userPoints, scooterMinimumDiscountScore, scooterDiscountPercentage);
    }

}
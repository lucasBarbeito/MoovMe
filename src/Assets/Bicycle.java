package Assets;

import ScorePoints.ScorePoint;

public class Bicycle extends Vehicle {

    private static final double BICYCLE_TRIP_COST = 0.80;      // per minute
    private static final double BICYCLE_TRIP_SCORE = 10;       // per trip
    private static final double BICYCLE_PENALTY_FEE = 1000;
    public static final int BICYCLE = 1;
    private double bicycleMinimumDiscountScore;
    private double bicycleDiscountPercentage;

    public Bicycle(int vehicleId, int vehicleLotId, Zone vehicleZone) {
        super(vehicleId, vehicleLotId, vehicleZone);
        vehicleFare = vehicleZone.getZoneCost() * BICYCLE_TRIP_COST;
        vehicleTripScore = BICYCLE_TRIP_SCORE;
        vehiclePenaltyFee = BICYCLE_PENALTY_FEE;
        bicycleMinimumDiscountScore = vehicleZone.getMinimumDiscountScore(BICYCLE);
        bicycleDiscountPercentage = vehicleZone.getDiscountPercentage(BICYCLE);
    }

    public double getVehicleFare(ScorePoint userPoints) {
        return super.getVehicleFare(userPoints, bicycleMinimumDiscountScore, bicycleDiscountPercentage);
    }

}

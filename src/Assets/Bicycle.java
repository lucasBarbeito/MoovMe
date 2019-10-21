package Assets;

import Zone.*;

public class Bicycle extends Vehicle {

    private final int BICYCLE_SCORE = 10;
    private final int BICYCLE_PENALTY_FEE = 1000;

    public Bicycle(int vehicleId, int vehicleLotId, Zone vehicleZone) {
        super(vehicleId, vehicleLotId, vehicleZone);
        vehicleFare = vehicleZone.getZoneCost() * 0.05;
        vehicleScore = BICYCLE_SCORE;
        vehiclePenaltyFee = BICYCLE_PENALTY_FEE;
    }

}

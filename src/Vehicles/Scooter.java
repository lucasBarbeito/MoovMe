package Vehicles;

import Zone.*;

public class Scooter extends Vehicle {

    private final int SCOOTER_SCORE = 20;
    private final int SCOOTER_PENALTY_FEE = 2000;

    public Scooter(int vehicleId, int vehicleLotId, Zone vehicleZone) {
        super(vehicleId, vehicleLotId, vehicleZone);
        vehicleFare = vehicleZone.getZoneCost() * 0.10;
        vehicleScore = SCOOTER_SCORE;
        vehiclePenaltyFee = SCOOTER_PENALTY_FEE;
    }

}
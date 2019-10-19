package Vehicles;

import Zone.*;

public class ElectricScooter extends Vehicle {

    public ElectricScooter(int vehicleId, int vehicleLotId) {
        super(vehicleId, vehicleLotId);
        vehicleFare = 0.10;
        vehicleScore = 20;
    }

}
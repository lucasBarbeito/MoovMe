package Vehicles;

import Zone.*;

public class Bicycle extends Vehicle {

    public Bicycle(int vehicleId, int vehicleLotId) {
        super(vehicleId, vehicleLotId);
        vehicleFare = 0.05;
        vehicleScore = 10;
    }

}

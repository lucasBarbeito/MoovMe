package Vehicles;

import Zone.*;

public abstract class Vehicle {

    private Zone vehicleZone;
    private int vehicleId, LotId;
    double vehicleFare, vehicleScore, vehiclePenaltyFee;

    Vehicle(int vehicleId, int LotId, Zone vehicleZone) {
        this.vehicleId = vehicleId;
        this.LotId = LotId;
        this.vehicleZone = vehicleZone;
    }

    public double getVehicleFare() {
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

}

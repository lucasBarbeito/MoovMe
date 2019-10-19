package Vehicles;

import Zone.*;

public abstract class Vehicle {

    private Zone vehicleZone;
    private int vehicleId, LotId;
    protected double vehicleFare, vehicleScore;

    Vehicle(int vehicleId, int LotId) {
        this.vehicleId = vehicleId;
        this.LotId = LotId;
    }

    public double getVehicleFare() {
        return vehicleFare;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public Zone getVehicleZone() {
        return vehicleZone;
    }

}

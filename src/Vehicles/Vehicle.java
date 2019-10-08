package Vehicles;

import Zone.Zone;

public abstract class Vehicle {

    protected Zone vehicleZone;
    protected int vehicleId, vehicleFare, vehicleScore;

    public Vehicle(Zone vehicleZone, int vehicleId) {
        this.vehicleZone = vehicleZone;
        this.vehicleId = vehicleId;
    }

    public int getVehicleFare() {
        return vehicleFare;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public Zone getVehicleZone() {
        return vehicleZone;
    }
}

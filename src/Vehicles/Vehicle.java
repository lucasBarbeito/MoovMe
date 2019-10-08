package Vehicles;

import Zone.Zone;

public abstract class Vehicle {

    protected Zone zone;
    protected int vehicleId, vehicleFare, vehicleScore;

    public Vehicle(Zone zone, int vehicleId) {
        this.zone = zone;
        this.vehicleId = vehicleId;
    }

    public int getVehicleFare() {
        return vehicleFare;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public Zone getZone() {
        return zone;
    }
}

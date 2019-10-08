package Vehicles;

import Zone.Zone;

public abstract class Vehicle {

    protected Zone zone;
    protected int vehicleId;
    protected int fare;

    public Vehicle(Zone zone, int vehicleId) {
        this.zone = zone;
        this.vehicleId = vehicleId;
    }

    public int getFare() {
        return fare;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public Zone getZone() {
        return zone;
    }
}

package Vehicles;

import Zone.Zone;

public class Bycicle extends Vehicle {

    private int bycicleFare, bycicleScore = 15;

    public Bycicle(Zone vehicleZone, int vehicleId) {
        super(vehicleZone, vehicleId);
        this.vehicleFare = bycicleFare + vehicleZone.getZoneId();
    }
}

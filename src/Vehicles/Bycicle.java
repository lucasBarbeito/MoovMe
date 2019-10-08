package Vehicles;

import Zone.Zone;

public class Bycicle extends Vehicle {

    private int bycicleFare, bycicleScore = 15;

    public Bycicle(Zone zone, int vehicleId) {
        super(zone, vehicleId);
        this.vehicleFare = bycicleFare + zone.getZoneId();
    }
}

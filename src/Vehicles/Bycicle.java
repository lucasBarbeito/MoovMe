package Vehicles;

import Zone.Zone;

public class Bycicle extends Vehicle {

    private int bycicleFare = 15;

    public Bycicle(Zone zone, int vehicleId) {
        super(zone, vehicleId);
        this.fare = bycicleFare + zone.getZoneId();
    }
}

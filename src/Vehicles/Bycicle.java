package Vehicles;

import Zone.Zone;

public class Bycicle extends Vehicle {

    private int bycicleFare = 15;


    public Bycicle(Zone zone, int id) {
        super(zone, id);
        this.fare = bycicleFare + zone.getZoneValue();
    }
}

package Vehicles;

import Zone.Zone;

public abstract class Vehicle {

    protected Zone zone;
    protected int id;
    protected int fare;


    public Vehicle(Zone zone, int id) {
        this.zone = zone;
        this.id = id;
    }

    public int getFare() {
        return fare;
    }

    public int getId() {
        return id;
    }

    public Zone getZone() {
        return zone;
    }
}

package Vehicles;

import Zone.Zone;

public class ElectricScooter extends Vehicle {

    private int electricScooterFare = 20;
    public ElectricScooter(Zone zone, int id) {
        super(zone, id);
        this.fare = electricScooterFare + zone.getZoneValue();
    }
}
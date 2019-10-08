package Vehicles;

import Zone.Zone;

public class ElectricScooter extends Vehicle {

    private int electricScooterFare = 20;

    public ElectricScooter(Zone zone, int vehicleId) {
        super(zone, vehicleId);
        this.fare = electricScooterFare + zone.getZoneId();
    }
}
package Vehicles;

import Zone.Zone;

public class ElectricScooter extends Vehicle {

    private int electricScooterFare, electricScooterScore = 20;

    public ElectricScooter(Zone zone, int vehicleId) {
        super(zone, vehicleId);
        this.vehicleFare = electricScooterFare + zone.getZoneId();
    }
}
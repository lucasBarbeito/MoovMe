package Vehicles;

import Zone.Zone;

public class ElectricScooter extends Vehicle {

    private int electricScooterFare, electricScooterScore = 20;

    public ElectricScooter(Zone vehicleZone, int vehicleId) {
        super(vehicleZone, vehicleId);
        this.vehicleFare = electricScooterFare + vehicleZone.getZoneId();
    }
}
package Vehicles;

import Zone.Zone;

public class ElectricScooter extends Vehicle {

    private int electricScooterFare, electricScooterScore = 20;
    private int electricScooterBatchId;

    public ElectricScooter(Zone vehicleZone, int vehicleId) {
        super(vehicleZone, vehicleId);
        this.vehicleFare = electricScooterFare + vehicleZone.getZoneId();
    }
    public ElectricScooter(Zone vehicleZone, int vehicleId, int electricScooterBatchId) {
        super(vehicleZone, vehicleId);
        this.vehicleFare = electricScooterFare + vehicleZone.getZoneId();
        this. electricScooterBatchId = electricScooterBatchId;
    }
}
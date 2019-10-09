package Vehicles;

import Zone.Zone;

public class Bycicle extends Vehicle {

    private int bycicleFare, bycicleScore = 15;
    private int bycicleBatchId;

    public Bycicle(Zone vehicleZone, int vehicleId) {
        super(vehicleZone, vehicleId);
        this.vehicleFare = bycicleFare + vehicleZone.getZoneId();
    }
    public Bycicle(Zone vehicleZone, int vehicleId, int bycicleBatchId) {
        super(vehicleZone, vehicleId);
        this.vehicleFare = bycicleFare + vehicleZone.getZoneId();
        this.bycicleBatchId = bycicleBatchId;
    }
}

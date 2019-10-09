package Vehicles;

import Zone.*;

public abstract class Vehicle {

    protected Zone vehicleZone;
    protected int vehicleId, vehicleFare, vehicleScore/*,vehicleBatchId*/;
    protected Terminal itsTerminal;

    public Vehicle(Zone vehicleZone, int vehicleId) {
        this.vehicleZone = vehicleZone;
        this.vehicleId = vehicleId;
    }
   /* public Vehicle(Zone vehicleZone, int vehicleId, int vehicleBatchId) {
        this.vehicleZone = vehicleZone;
        this.vehicleId = vehicleId;
        this.vehicleBatchId = vehicleBatchId;
    }*/


    public int getVehicleFare() {
        return vehicleFare;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public Zone getVehicleZone() {
        return vehicleZone;
    }

    public void setItsTerminal(Terminal itsTerminal) {
        this.itsTerminal = itsTerminal;
    }
    public Terminal getItsTerminal() {
        return itsTerminal;
    }
}

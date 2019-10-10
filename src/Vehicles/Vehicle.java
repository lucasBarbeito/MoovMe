package Vehicles;

import Zone.*;

public abstract class Vehicle {

    protected Zone vehicleZone;
    protected int vehicleId, vehicleFare, vehicleScore, vehicleLotId;
    protected Terminal itsTerminal;

    public Vehicle(Zone vehicleZone, int vehicleId, int vehicleFare, int vehicleScore, int vehicleLotId, Terminal itsTerminal) {
        this.vehicleZone = vehicleZone;
        this.vehicleId = vehicleId;
        this.vehicleFare = vehicleFare;
        this.vehicleScore = vehicleScore;
        this.vehicleLotId = vehicleLotId;
        this.itsTerminal = itsTerminal;
    }

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

package Zone;

import Vehicles.Vehicle;

import java.util.ArrayList;

public class Terminal {
    private Zone itsZone;
    private ArrayList<Vehicle> vehicles;
    private int terminalId;

    public Terminal(Zone itsZone, int terminalId){
        this.itsZone = itsZone;
        this.terminalId = terminalId;
        vehicles = new ArrayList<Vehicle>();
    }

    public void addVehiclesToTerminal(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void removeVehiclesFromTerminal(Vehicle vehicle){
        vehicles.remove(vehicle);
    }

    public int getTerminalId() {
        return terminalId;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public Zone getItsZone() {
        return itsZone;
    }
}

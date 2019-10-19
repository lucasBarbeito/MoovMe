package Vehicles;

import Database.VehicleDatabase;
import Vehicles.Vehicle;
import Zone.Zone;

import java.util.HashMap;

public class Terminal {
    private Zone itsZone;
    private HashMap<Integer, Vehicle> vehiclesInTerminal;
    private int terminalId;

    public Terminal(Zone itsZone, int terminalId){
        this.itsZone = itsZone;
        this.terminalId = terminalId;
        vehiclesInTerminal = new HashMap<>();
    }

    public void addVehiclesToTerminal(int vehicleId, Vehicle aVehicle){
        vehiclesInTerminal.put(vehicleId, aVehicle);
    }

    public void removeVehiclesFromTerminal(int vehicleId){
        vehiclesInTerminal.remove(vehicleId);
    }

    public int getTerminalId() {
        return terminalId;
    }

    // Remueve el vehiculo de la terminal y regresa ese vehiculo.
    public Vehicle takeOutVehicle(int vehicleId) {
        Vehicle aVehicle = vehiclesInTerminal.get(vehicleId);
        vehiclesInTerminal.remove(vehicleId);
        return aVehicle;
    }

    public boolean checkForVehicleInTerminal(int vehicleId) {
        return vehiclesInTerminal.containsKey(vehicleId);
    }

    public Vehicle getVehicle(int vehicleId) {
        Vehicle aVehicle = vehiclesInTerminal.get(vehicleId);
        return aVehicle;
    }

}

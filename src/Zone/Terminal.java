package Zone;

import Database.VehicleDatabase;
import Vehicles.Vehicle;
import java.util.HashMap;

public class Terminal {
    private Zone itsZone;
    private HashMap<Integer, Vehicle> vehicles;
    private int terminalId;
    private VehicleDatabase vehicleDatabase;

    public Terminal(Zone itsZone, int terminalId, VehicleDatabase vehicleDatabase){
        this.itsZone = itsZone;
        this.terminalId = terminalId;
        this.vehicleDatabase = vehicleDatabase;
        vehicles = new HashMap<>();
    }

    public void addVehiclesToTerminal(int vehicleId, Vehicle aVehicle){
        vehicles.put(vehicleId, aVehicle);
    }

    public void removeVehiclesFromTerminal(int vehicleId){
        vehicles.remove(vehicleId);
    }

    public int getTerminalId() {
        return terminalId;
    }

    // Remueve el vehiculo de la terminal, en la base de datos
    // lo pasa de los vehiculos en terminales a vehiculos en uso
    // y regresa ese vehiculo.
    public Vehicle takeOutVehicle(int vehicleId) {
        Vehicle aVehicle = vehicles.get(vehicleId);
        vehicles.remove(vehicleId);
        vehicleDatabase.fromTerminalToInUse(vehicleId);
        return aVehicle;
    }
}

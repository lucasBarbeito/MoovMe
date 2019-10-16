package Database;

import Vehicles.Vehicle;
import java.util.HashMap;

public class VehicleDatabase extends Database  {

    private HashMap<Integer, Vehicle> vehiclesInUse;
    private HashMap<Integer, Vehicle> vehiclesInTerminal;

    private VehicleDatabase() {
        vehiclesInUse = new HashMap<>();
        vehiclesInTerminal = new HashMap<>();
    }

    /*
    public void printData() {
        for (Vehicle aVehicle : hashmap.values()) {
            System.out.println();
        }
    }
    */

    //
    public void fromTerminalToInUse(int vehicleId) {
        vehiclesInUse.put(vehicleId, vehiclesInTerminal.get(vehicleId));
        vehiclesInTerminal.remove(vehicleId);
    }

}

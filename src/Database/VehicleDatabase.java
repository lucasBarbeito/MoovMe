package Database;

import Assets.Vehicle;
import java.util.HashMap;

public class VehicleDatabase extends Database  {

    private HashMap<Integer, Vehicle> vehiclesInUse;
    private HashMap<Integer, Vehicle> vehiclesInTerminal;

    private VehicleDatabase() {
        vehiclesInUse = new HashMap<>();
        vehiclesInTerminal = new HashMap<>();
    }

    public void fromTerminalToInUse(int vehicleId) {
        vehiclesInUse.put(vehicleId, vehiclesInTerminal.get(vehicleId));
        vehiclesInTerminal.remove(vehicleId);
    }

}

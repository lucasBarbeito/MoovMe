package Assets;

import java.util.ArrayList;
import java.util.HashMap;

public class Terminal {

    private Zone terminalZone;
    private HashMap<Integer, Vehicle> vehiclesInTerminal;
    private int terminalId;

    public Terminal(Zone terminalZone, int terminalId){
        this.terminalZone = terminalZone;
        this.terminalId = terminalId;
        vehiclesInTerminal = new HashMap<>();
    }

    public void addVehiclesToTerminal(ArrayList<Vehicle> vehicles){
        for (Vehicle aVehicle : vehicles) {
            addVehicleToTerminal(aVehicle.getVehicleId(), aVehicle);
        }
    }

    public void addVehicleToTerminal(int vehicleId, Vehicle aVehicle) {
        vehiclesInTerminal.put(vehicleId, aVehicle);
    }

    public int getTerminalId() {
        return terminalId;
    }

    public boolean checkForVehicleInTerminal(int vehicleId) {
        return vehiclesInTerminal.containsKey(vehicleId);
    }

    public Vehicle getVehicle(int vehicleId) {
        Vehicle aVehicle = vehiclesInTerminal.get(vehicleId);
        vehiclesInTerminal.remove(vehicleId);
        return aVehicle;
    }

}

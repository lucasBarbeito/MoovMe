package Zone;

import Assets.Terminal;
import Assets.Vehicle;

import java.util.ArrayList;

public class Zone {

    private String zoneName;
    private double zoneCost;
    private ArrayList<Terminal> terminalsInTheZone;

    public Zone(String zoneName, double zoneCost) {
        this.zoneName = zoneName;
        this.zoneCost = zoneCost;
    }

    public double getZoneCost() {
        return zoneCost;
    }

    public String getZoneName() {
        return zoneName;
    }

    public Vehicle checkForVehicleInZone(int vehicleId) {
        for (Terminal terminal: terminalsInTheZone) {
            if (terminal.checkForVehicleInTerminal(vehicleId)){
                return terminal.getVehicle(vehicleId);
            }
        }
        throw new RuntimeException("Vehicle not in zone");
    }

    public void saveVehicleInTerminal(Vehicle vehicle, int terminalId) {
        for (Terminal terminal: terminalsInTheZone) {
            if (terminalId == terminal.getTerminalId()){
                terminal.addVehiclesToTerminal(vehicle.getVehicleId(), vehicle);
            }
        }
    }
}

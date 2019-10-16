package Zone;


import Vehicles.Vehicle;

import java.util.ArrayList;

public class Zone {

    private String zoneName;
    private double discountPerPoint;
    private ArrayList<Terminal> terminalsInTheZone;

    public Zone(String zoneName, double discountPerPoint) {
        this.zoneName = zoneName;
        this.discountPerPoint = discountPerPoint;
    }

    public double getDiscountPerPoint() {
        return discountPerPoint;
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
                terminal.addVehiclesToTerminal(vehicle);
            }
        }
    }
}

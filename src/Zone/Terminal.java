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

    public boolean checkForVehicleInTerminal(int vehicleId) {
        for (Vehicle vehicle: vehicles) {
            if (vehicle.getVehicleId() == vehicleId){
                return true;
            }
        }
        return false;
    }

    public Vehicle getVehicle(int vehicleId) {
        for (Vehicle vehicle: vehicles) {
            if (vehicle.getVehicleId() == vehicleId){
                return vehicle;
            }
        }
        throw new RuntimeException();
    }
}

package Zone;

import Vehicles.Vehicle;

import java.util.ArrayList;

public class Terminal {
    private String street;
    private Zone itsZone;
    private ArrayList<Vehicle> vehicles;

    public Terminal(String street, Zone itsZone){
        this.street = street;
        this.itsZone = itsZone;
        vehicles = new ArrayList<Vehicle>();

    }
    public void addVehcileToTerminal(Vehicle vehicle){
        vehicles.add(vehicle);
    }
    public void removeVehcileFromTerminal(Vehicle vehicle){
        vehicles.remove(vehicle);
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
    public String getStreet() {
        return street;
    }
    public Zone getItsZone() {
        return itsZone;
    }
}

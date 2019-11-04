package Assets;

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleLot {

    private int lotId;
    private ArrayList<Vehicle> vehicles;

    public VehicleLot(int lotId, ArrayList<Vehicle> vehicles) {
        this.lotId = lotId;
        this.vehicles = vehicles;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public int getNumberOfVehicles() {
        return vehicles.size();
    }

}

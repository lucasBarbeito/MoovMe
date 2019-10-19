package Vehicles;

import java.util.HashMap;

public class Lot {

    protected int lotId;
    protected HashMap<Integer, Vehicle> vehicles;

    public Lot(int lotId, HashMap vehicles) {
        this.lotId = lotId;
        this.vehicles = vehicles;
    }

}

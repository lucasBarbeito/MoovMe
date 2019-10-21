package Assets;

import java.util.HashMap;

public class Lot {

    private int lotId;
    private HashMap<Integer, Vehicle> vehicles;

    public Lot(int lotId, HashMap vehicles) {
        this.lotId = lotId;
        this.vehicles = vehicles;
    }

}

package Zone;

import IDGenerator.IdGenerator;
import Vehicles.Vehicle;

import java.util.ArrayList;

public class Zone {

    private String zoneName;
    private ArrayList<Terminal> terminalsInTheZone;

    public Zone(String zoneName) {
        this.zoneName = zoneName;
        terminalsInTheZone = new ArrayList<Terminal>();
    }

    public String getZoneName() {
        return zoneName;
    }

}

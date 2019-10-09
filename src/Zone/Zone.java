package Zone;

import IDGenerator.IdGenerator;
import Vehicles.Vehicle;

import java.util.ArrayList;

public class Zone {

    private String zoneName;
    private int zoneId;
    private ArrayList<Terminal> terminalsInTheZone;

    public Zone(String zoneName, int zoneId) {
        this.zoneName = zoneName;
        this.zoneId = zoneId;
        terminalsInTheZone = new ArrayList<Terminal>();
    }

    public String getZoneName() {
        return zoneName;
    }

    public int getZoneId() {
        return zoneId;
    }
}

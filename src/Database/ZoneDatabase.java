package Database;

import Zone.Zone;
import java.util.HashMap;

public class ZoneDatabase extends Database {

    private HashMap<String, Zone> zones;

    public ZoneDatabase() {
        zones = new HashMap<>();
    }

    public Zone findZone(String zoneName) {
        return find(zoneName.toLowerCase(), zones);
    }

    public void addZone(Zone aZone) {
        add(aZone.getZoneName().toLowerCase(), aZone, zones);
    }

    public void removeZone(String zoneName) {
        remove(zoneName.toLowerCase(), zones);
    }

    public void joinZones() {}

}

package Database;

import Assets.Zone;

import java.util.ArrayList;
import java.util.HashMap;

public class ZoneDatabase extends Database {

    private HashMap<String, Zone> zones;
    private ArrayList<String> zonesNames;

    public ZoneDatabase() {
        zones = new HashMap<>();
        zonesNames = new ArrayList<>();
    }

    public Zone findZone(String zoneName) {
        return find(zoneName.toLowerCase(), zones);
    }

    public void addZone(Zone aZone) {
        String zoneName = aZone.getZoneName().toLowerCase();
        add(zoneName, aZone, zones);
        zonesNames.add(zoneName);
    }

    public void removeZone(String zoneName) {
        remove(zoneName.toLowerCase(), zones);
    }

    public void joinZones() {}

    public ArrayList<String> getZonesNames() {
        return new ArrayList<String>(zonesNames);
    }

}

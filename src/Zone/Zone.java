package Zone;

import IDGenerator.IdGenerator;

public class Zone {

    private String zoneName;
    private int zoneId;

    public Zone(String zoneName, int zoneId) {
        this.zoneName = zoneName;
        this.zoneId = zoneId;
    }

    public String getZoneName() {
        return zoneName;
    }

    public int getZoneId() {
        return zoneId;
    }
}

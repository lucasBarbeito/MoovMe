package IDGenerator;

public class IdGenerator {

    public static int lastUserId, lastVehicleId, lastLotId, lastZoneId;

    public static int getNewUserId() {
        return ++lastUserId;
    }

    public static int getNewVehicleId() {
        return ++lastVehicleId;
    }

    public static int getNewLotId() {
        return ++lastLotId;
    }

    public static int getNewZoneId() {
        return ++lastZoneId;
    }
}

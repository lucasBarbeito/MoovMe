package IDGenerator;

public class IdGenerator {

    public static int lastUserId, lastVehicleId, lastLotId, lastZoneId, lastBycicleBatchId,lastElectricSooterId = 0;

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

    public static int getNewBycicleBatchId() {
        return ++lastBycicleBatchId;
    }

    public static int getNewElectricSooterId() {
        return ++lastElectricSooterId;
    }

}

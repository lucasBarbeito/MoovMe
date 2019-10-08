package IDGenerator;

abstract class IdGenerator {

    static int lastUserId, lastVehicleId, lastLotId, lastZoneId;

    static int getNewUserId() {
        return ++lastUserId;
    }

    static int getNewVehicleId() {
        return ++lastVehicleId;
    }

    static int getNewLotId() {
        return ++lastLotId;
    }

    static int getNewZoneId() {
        return ++lastZoneId;
    }
}

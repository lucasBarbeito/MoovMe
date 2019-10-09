package IDGenerator;

public class IdGenerator {

    public int lastUserId, lastVehicleId, lastBatchId, lastZoneId, lastBycicleBatchId,lastElectricSooterId = 0;

    public int getNewUserId() {
        return ++lastUserId;
    }

    public int getNewVehicleId() {
        return ++lastVehicleId;
    }

    public int getNewBatchId() {
        return ++lastBatchId;
    }

    public int getNewZoneId() {
        return ++lastZoneId;
    }

    public int getNewBycicleBatchId() {
        return ++lastBycicleBatchId;
    }

    public int getNewElectricSooterId() {
        return ++lastElectricSooterId;
    }

}

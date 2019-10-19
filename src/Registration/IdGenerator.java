package Registration;

public class IdGenerator {

    private int lastVehicleId, lastLotId, lastTerminalId;

    public IdGenerator() {
        lastVehicleId = 0;
        lastLotId = 0;
        lastTerminalId = 0;
    }

    public int getNewVehicleId() {
        return ++lastVehicleId;
    }

    public int getNewLotId() {
        return ++lastLotId;
    }

    public int getNewTerminalId() { return ++lastTerminalId; }

}

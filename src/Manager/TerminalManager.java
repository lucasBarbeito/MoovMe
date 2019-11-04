package Manager;

import Assets.*;
import Database.TerminalDatabase;
import IdGenerator.IdGenerator;
import java.util.ArrayList;

public class TerminalManager {

    private TerminalDatabase aTerminalDatabase;
    private IdGenerator anIdGenerator;

    public TerminalManager(TerminalDatabase aTerminalDatabase, IdGenerator anIdGenerator) {
        this.aTerminalDatabase = aTerminalDatabase;
        this.anIdGenerator = anIdGenerator;
    }

    public void addTerminal(Zone aZone) {
        Terminal newTerminal = new Terminal(aZone, anIdGenerator.getNewTerminalId());
        aTerminalDatabase.addTerminal(newTerminal);
    }

    public void removeTerminal(Integer terminalId) {
        aTerminalDatabase.removeTerminal(terminalId);
    }

    public void newBicycleLot(int numberOfBicycles, Zone aZone, int terminalId) {
        int newLotId = anIdGenerator.getNewLotId();
        Terminal terminalToAddLot = aTerminalDatabase.findTerminal(terminalId);
        ArrayList<Vehicle> vehicles = new ArrayList<>(numberOfBicycles);
        for (int i = 0; i < numberOfBicycles; i++) {
            vehicles.add(new Bicycle(anIdGenerator.getNewVehicleId(), newLotId, aZone));
        }
        VehicleLot newVehicleLot = new VehicleLot(newLotId, vehicles);
        terminalToAddLot.addVehiclesToTerminal(newVehicleLot.getVehicles());
    }

    public void newScooterLot(int numberOfScooters, Zone aZone, int terminalId) {
        int newLotId = anIdGenerator.getNewLotId();
        Terminal terminalToAddLot = aTerminalDatabase.findTerminal(terminalId);
        ArrayList<Vehicle> vehicles = new ArrayList<>(numberOfScooters);
        for (int i = 0; i < numberOfScooters; i++) {
            vehicles.add(new Scooter(anIdGenerator.getNewVehicleId(), newLotId, aZone));
        }
        VehicleLot newVehicleLot = new VehicleLot(newLotId, vehicles);
        terminalToAddLot.addVehiclesToTerminal(newVehicleLot.getVehicles());
    }

    /*
    private  <T extends Vehicle> void newVehicleLot(int numberOfVehicles, Zone aZone) {
        int newLotId = anIdGenerator.getNewLotId();
        HashMap<Integer, T> vehicles = new HashMap<>();
        for (int i = 0; i < numberOfVehicles; i++) {
            vehicles.put(anIdGenerator.getNewVehicleId(), new T(anIdGenerator.getNewVehicleId(), newLotId, aZone));
        }
    }
    private Bicycle newBicycle(int newLotId, Zone aZone) {
        return new Bicycle(anIdGenerator.getNewVehicleId(), newLotId, aZone);
    }
    */

    public TerminalDatabase getTerminalDataBase() {
        return aTerminalDatabase;
    }

}

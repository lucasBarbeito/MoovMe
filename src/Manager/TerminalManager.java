package Manager;

import Database.TerminalDataBase;
import IdGenerator.IdGenerator;
import Vehicles.Bicycle;
import Vehicles.Scooter;
import Vehicles.Lot;
import Vehicles.Terminal;
import Zone.Zone;

import java.util.HashMap;

public class TerminalManager {

    private TerminalDataBase aTerminalDataBase;
    private IdGenerator anIdGenerator;

    public TerminalManager(TerminalDataBase aTerminalDataBase, IdGenerator anIdGenerator) {
        this.aTerminalDataBase = aTerminalDataBase;
        this.anIdGenerator = anIdGenerator;
    }

    public void addTerminal(String zoneName, double discountPerPoint) {
        Terminal newTerminal = new Terminal(new Zone(zoneName, discountPerPoint), anIdGenerator.getNewTerminalId());
        aTerminalDataBase.addTerminal(newTerminal);
    }

    public void removeTerminal(Integer terminalId) {
        aTerminalDataBase.removeTerminal(terminalId);
    }

    public void newBicycleLot(int numberOfBicycles, Zone aZone) {
        int newLotId = anIdGenerator.getNewLotId();
        HashMap<Integer, Bicycle> vehicles = new HashMap<>();
        for (int i = 0; i < numberOfBicycles; i++) {
            vehicles.put(anIdGenerator.getNewVehicleId(), new Bicycle(anIdGenerator.getNewVehicleId(), newLotId, aZone));
        }
        newLot(newLotId, vehicles);
    }

    public void newScooterLot(int numberOfScooters, Zone aZone) {
        int newLotId = anIdGenerator.getNewLotId();
        HashMap<Integer, Scooter> vehicles = new HashMap<>();
        for (int i = 0; i < numberOfScooters; i++) {
            vehicles.put(anIdGenerator.getNewVehicleId(), new Scooter(anIdGenerator.getNewVehicleId(), newLotId, aZone));
        }
        newLot(newLotId, vehicles);
    }

    private <T> void newLot(int lotId, HashMap<Integer, T> vehicles) {
        Lot aLot = new Lot(lotId, vehicles);
    }

    // Se usa para cuando el UserManager va a crear Admins, el llama
    // el metodo AddToABM y pasa como argumento la TerminalDatabase
    public TerminalDataBase getTerminalDataBase() {
        return aTerminalDataBase;
    }

}

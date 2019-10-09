package ABM;

import IDGenerator.IdGenerator;
import Vehicles.Bycicle;
import Vehicles.ElectricScooter;
import Vehicles.Vehicle;
import Zone.Terminal;

import java.util.ArrayList;

public class VehicleABM extends ABM <Vehicle> {

    public VehicleABM(int initialNumberOfVehicles) {
        super(initialNumberOfVehicles);
    }

    public Bycicle[] createBycicleBatch(int cuantity, Terminal terminal, IdGenerator idGenerator) {
        Bycicle[] newBycicleBatch = new Bycicle[cuantity];
        int numberOfBatch = idGenerator.getNewBycicleBatchId();
        for (int i = 0;i<newBycicleBatch.length;i++){
            newBycicleBatch[i] = new Bycicle(terminal.getItsZone(), idGenerator.getNewVehicleId(),numberOfBatch);
            add(newBycicleBatch[i]);
        }
        return newBycicleBatch;
    }

    public ElectricScooter[] createElectricSooterBatch(int cuantity, Terminal terminal, IdGenerator idGenerator) {
        ElectricScooter[] newElectricScooterBatch = new ElectricScooter[cuantity];
        int numberOfBatch = idGenerator.getNewElectricSooterId();
        for (int i = 0;i<newElectricScooterBatch.length;i++){
            newElectricScooterBatch[i] = new ElectricScooter(terminal.getItsZone(), idGenerator.getNewVehicleId(),numberOfBatch);
            add(newElectricScooterBatch[i]);
        }
        return newElectricScooterBatch;
    }

}
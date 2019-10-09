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

    public Bycicle[] createBycicleBatch(int cuantity, Terminal terminal) {
        Bycicle[] newBycicleBatch = new Bycicle[cuantity];
        int numberOfBatch = IdGenerator.getNewBycicleBatchId();
        for (int i = 0;i<newBycicleBatch.length;i++){
            newBycicleBatch[i] = new Bycicle(terminal.getItsZone(), IdGenerator.getNewVehicleId(),numberOfBatch);
            add(newBycicleBatch[i]);
        }
        return newBycicleBatch;

    }
    public ElectricScooter[] createElectricSooterBatch(int cuantity, Terminal terminal) {
        ElectricScooter[] newElectricScooterBatch = new ElectricScooter[cuantity];
        int numberOfBatch = IdGenerator.getNewElectricSooterId();
        for (int i = 0;i<newElectricScooterBatch.length;i++){
            newElectricScooterBatch[i] = new ElectricScooter(terminal.getItsZone(), IdGenerator.getNewVehicleId(),numberOfBatch);
            add(newElectricScooterBatch[i]);
        }
        return newElectricScooterBatch;

    }
}
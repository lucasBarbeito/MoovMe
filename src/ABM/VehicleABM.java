package ABM;

import Vehicles.Bycicle;
import Vehicles.ElectricScooter;
import Zone.Terminal;

public class VehicleABM {

    // HAY QUE AGRUPAR AMBOS METODOS EN UNO SOLO DE ALGUNA MANERA, PARA ELIMINAR CODIGO

    /*
    public Bycicle[] createBycicleBatch(int cuantity, Terminal terminal) {
        Bycicle[] newBycicleBatch = new Bycicle[cuantity];
        int numberOfBatch = idGenerator.getNewBycicleBatchId();
        for (int i = 0;i<newBycicleBatch.length;i++) {
            newBycicleBatch[i] = new Bycicle(terminal.getItsZone(), idGenerator.getNewVehicleId(),numberOfBatch);
            add(newBycicleBatch[i]);
        }
        return newBycicleBatch;
    }

    public ElectricScooter[] createElectricSooterBatch(int cuantity, Terminal terminal) {
        ElectricScooter[] newElectricScooterBatch = new ElectricScooter[cuantity];
        int numberOfBatch = idGenerator.getNewElectricSooterId();
        for (int i = 0;i<newElectricScooterBatch.length;i++) {
            newElectricScooterBatch[i] = new ElectricScooter(terminal.getItsZone(), idGenerator.getNewVehicleId(),numberOfBatch);
            add(newElectricScooterBatch[i]);
        }
        return newElectricScooterBatch;
    }
    */

}
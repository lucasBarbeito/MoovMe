import IDGenerator.IdGenerator;
import Vehicles.Vehicle;

public class Lot {

    private Vehicle vehicle;
    private int quantityOfVehicles, lotId, totalLots;

    public Lot(Vehicle vehicle, int quantityOfVehicles){
        this.quantityOfVehicles = quantityOfVehicles;
        this.vehicle = vehicle;
        lotId = IdGenerator.getNewLotId();
    }
}

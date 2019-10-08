import Vehicles.Vehicle;

public class Lot {

    private Vehicle vehicle;
    private int quantityOfVehicles;
    private int lotId;
    private int totalLots;

    public Lot(Vehicle vehicle, int quantityOfVehicles){
        this.quantityOfVehicles = quantityOfVehicles;
        this.vehicle = vehicle;
        int lotId = totalLots;
        totalLots ++;
    }
}

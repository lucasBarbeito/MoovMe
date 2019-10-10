import IDGenerator.IdGenerator;
import Vehicles.Vehicle;

public class Batch {

        private Vehicle vehicle;
        private int quantityOfVehicles, batchId, totalBatchess;

        public Batch(Vehicle vehicle, int quantityOfVehicles){
            this.quantityOfVehicles = quantityOfVehicles;
            this.vehicle = vehicle;
            batchId = IdGenerator.getNewBatchId();
        }

        // you are ga
}

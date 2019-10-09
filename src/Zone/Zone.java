package Zone;

import IDGenerator.IdGenerator;
import Vehicles.Vehicle;

import java.util.ArrayList;

public class Zone {

    private String zoneName;
    private int zoneId;
    private ArrayList<Terminal> terminalsInTheZone;

    public Zone(String zoneName, int zoneId) {
        this.zoneName = zoneName;
        this.zoneId = zoneId;
        terminalsInTheZone = new ArrayList<Terminal>();
    }

    public String getZoneName() {
        return zoneName;
    }

    public int getZoneId() {
        return zoneId;
    }

    public static class Lot {

        private Vehicle vehicle;
        private int quantityOfVehicles, lotId, totalLots;


        public Lot(Vehicle vehicle, int quantityOfVehicles){
            this.quantityOfVehicles = quantityOfVehicles;
            this.vehicle = vehicle;
            lotId = IdGenerator.getNewLotId();

        }
    }
}

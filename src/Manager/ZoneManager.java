package Manager;

import Assets.Discount;
import Assets.Zone;
import Database.ZoneDatabase;

public class ZoneManager {

    private ZoneDatabase aZoneDatabase;

    public ZoneManager(ZoneDatabase aZoneDatabase) {
        this.aZoneDatabase = aZoneDatabase;
    }

    public void changeMinimumDiscountScore(String zoneName, int typeOfVehicle, double newMinimumDiscountScore) {
        Discount zoneDiscount = findDiscount(zoneName, typeOfVehicle);
        zoneDiscount.changeMinimumDiscountScore(newMinimumDiscountScore);
    }

    public void changeDiscountPercentage(String zoneName, int typeOfVehicle, double newDiscountPercentage) {
        Discount zoneDiscount = findDiscount(zoneName, typeOfVehicle);
        zoneDiscount.changeDiscountPercentage(newDiscountPercentage);
    }

    private Discount findDiscount(String zoneName, int typeOfVehicle) {
        Zone aZone = aZoneDatabase.findZone(zoneName);
        return aZone.getDiscount(typeOfVehicle);
    }

    public ZoneDatabase getAZoneDatabase() {
        return aZoneDatabase;
    }
}

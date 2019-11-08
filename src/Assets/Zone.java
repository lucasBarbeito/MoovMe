package Assets;

import ScorePoints.ScoreBoard;

import java.util.ArrayList;

public class Zone {

    private String zoneName;
    private double zoneCost;
    private ScoreBoard zoneScoreboard;
    private ArrayList<Discount> zoneDiscounts;
    private static final int TYPES_OF_VEHICLES = 2;

    public Zone(String zoneName, double zoneCost) {
        this.zoneName = zoneName;
        this.zoneCost = zoneCost;
        zoneScoreboard = new ScoreBoard(zoneName);
        discountInitializer();
    }

    private void discountInitializer() {
        zoneDiscounts = new ArrayList<>(TYPES_OF_VEHICLES);
        zoneDiscounts.add(new BicycleDiscount(40, 0.20));
        zoneDiscounts.add(new ScooterDiscount(60, 0.40));
    }

    public double getMinimumDiscountScore(int typeOfVehicle) {
        return zoneDiscounts.get(typeOfVehicle).getMinimumDiscountScore();
    }

    public double getDiscountPercentage(int typeOfVehicle) {
        return zoneDiscounts.get(typeOfVehicle).getDiscountPercentage();
    }

    public Discount getDiscount(int typeOfVehicle) {
        return zoneDiscounts.get(typeOfVehicle);
    }

    double getZoneCost() {
        return zoneCost;
    }

    public String getZoneName() {
        return zoneName;
    }

    /*
    public Vehicle checkForVehicleInZone(int vehicleId) {
        for (Terminal terminal: terminalsInTheZone) {
            if (terminal.checkForVehicleInTerminal(vehicleId)){
                return terminal.getVehicle(vehicleId);
            }
        }
    }
    */
}

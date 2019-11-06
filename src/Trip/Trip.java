package Trip;

import Assets.Terminal;
import Assets.Vehicle;
import Assets.Zone;
import Database.TerminalDatabase;
import Members.User;
import ScorePoints.ScorePoint;

import java.time.Duration;
import java.time.LocalTime;

public class Trip {

    private User aUser;
    private Vehicle usedVehicle;
    private LocalTime startTime;
    private Zone tripZone;
    private ScorePoint userPoints;
    private TerminalDatabase aTerminalDatabase;

    // hay que chequear que el id de terminal y de vehiculo existen, luego que ese vehiculo este en esa terminal
    public Trip(User aUser, int startTerminalId, int vehicleId, LocalTime startTime) {
        this.aUser = aUser;
        Terminal startTerminal = aTerminalDatabase.findTerminal(startTerminalId);
        this.usedVehicle = startTerminal.getVehicle(vehicleId);
        this.startTime = startTime;
        tripZone = usedVehicle.getVehicleZone();
        userPoints = aUser.getUserPoints(tripZone.getZoneName());
        checkIfFirstTripInZone();
        giveTripPointsToUser();
    }

    private void checkIfFirstTripInZone() {
        String zoneName = tripZone.getZoneName();
        if(aUser.firstTimeInZone(zoneName)) {
            aUser.addScoreboard(zoneName);
        }
    }

    private void giveTripPointsToUser() {
        aUser.addPoints(tripZone.getZoneName(), usedVehicle.getVehicleTripScore());
    }

    // trip tiene que relacionarse con algo de las multas por escape de zona
    // se podria crear un historial de los viajes
    public void endGoodTrip(int terminalId) {
        Terminal endTerminal = aTerminalDatabase.findTerminal(terminalId);
        endTerminal.addVehicleToTerminal(usedVehicle.getVehicleId(), usedVehicle);
        if(userPoints.isMonthlyTop3()) {
            userPoints.resetMonthlyTop3();
            aUser.payTrip(calculateTripFare() * calculateTripDuration() * 0.5);
        } else {
            aUser.payTrip(calculateTripFare() * calculateTripDuration());
        }
    }

    public void endBadTrip() {
        aUser.payTrip(calculateTripFare() * calculateTripDuration());
        // falta ver tema de multa, bloqueo y regreso de activo
    }

    private double calculateTripDuration() {
        return Duration.between(startTime, LocalTime.now()).getSeconds() / 60.0;
    }

    private double calculateTripFare() {
        String tripZoneName = tripZone.getZoneName();
        return usedVehicle.getVehicleFare(aUser.getUserPoints(tripZoneName));
    }

}

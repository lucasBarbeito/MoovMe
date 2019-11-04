package Trip;

import Assets.Terminal;
import Assets.Vehicle;
import Database.TerminalDatabase;
import Members.User;

import java.time.Duration;
import java.time.LocalTime;

public class Trip {

    private User aUser;
    private Vehicle usedVehicle;
    private LocalTime startTime;
    private TerminalDatabase aTerminalDatabase;

    // hay que chequear que el id de terminal y de vehiculo existen, luego que ese vehiculo este en esa terminal
    public Trip(User aUser, int startTerminalId, int vehicleId, LocalTime startTime) {
        this.aUser = aUser;
        Terminal startTerminal = aTerminalDatabase.findTerminal(startTerminalId);
        this.usedVehicle = startTerminal.getVehicle(vehicleId);
        this.startTime = startTime;
        checkIfFirstTripInZone();
        giveTripPointsToUser();
    }

    private void checkIfFirstTripInZone() {
        String zoneName = usedVehicle.getVehicleZone().getZoneName();
        if(aUser.firstTimeInZone(zoneName)) {
            aUser.addScoreboard(zoneName);
        }
    }

    private void giveTripPointsToUser() {
        aUser.addPoints(usedVehicle.getVehicleZone().getZoneName(), usedVehicle.getVehicleTripScore());
    }

    // trip tiene que relacionarse con algo de las multas por escape de zona
    // se podria crear un historial de los viajes
    public void endGoodTrip(int terminalId) {
        Terminal endTerminal = aTerminalDatabase.findTerminal(terminalId);
        endTerminal.addVehicleToTerminal(usedVehicle.getVehicleId(), usedVehicle);
        aUser.payTrip(calculateTripFare() * calculateTripDuration());
    }

    public void endBadTrip() {
        aUser.payTrip(calculateTripFare() * calculateTripDuration());
        // falta ver tema de multa, bloqueo y regreso de activo
    }

    private double calculateTripDuration() {
        return Duration.between(startTime, LocalTime.now()).getSeconds() / 60.0;
    }

    private double calculateTripFare() {
        String tripZoneName = usedVehicle.getVehicleZone().getZoneName();
        return usedVehicle.getVehicleFare(aUser.getUserPoints(tripZoneName));
    }

}

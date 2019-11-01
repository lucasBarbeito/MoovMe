package Members;

import ScorePoints.ScorePoint;
import Trip.Trip;
import Assets.Vehicle;

import java.util.HashMap;

public class User {

    private String username, phoneNumber;
    private boolean blocked;
    private Vehicle vehicleInUse;
    private double moneySpent;
    private Trip trip;
    private HashMap<Integer, ScorePoint> points = new HashMap<>();

    public User(String username, String phoneNumber){
        this.username = username;
        this.phoneNumber = phoneNumber;
        blocked = false;
        moneySpent = 0;
    }

    public String getUsername() {
        return username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean getBlockedStatus() {
        return blocked;
    }

    public void blockUser() {
        blocked = true;
    }
    public void unBlockUser() {
        blocked = false;
    }

    // El usuario se acerca a la terminal e ingresa en la app el id de la terminal
    // y el id del vehiculo para iniciar el viaje. Luego de eso la terminal le
    // otorga el vehiculo y el usuario puede usarlo
    public void startTrip(int terminalId, int vehicleId) {

    }

    public void payment() {
        moneySpent += vehicleInUse.getVehiclePenaltyFee();
        /*
         todo: falta sumarle tambien el tiempo que estuvo de viaje antes de salir de la zona
         todo: falta hacer algo que evite que explote si se llama el metodo y la persona no
               esta de viaje, es decir si no tiene vehiculo
        */
    }

}
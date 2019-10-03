package Members;


import Vehicles.Vehicle;

public class Client extends Users{

    int totalPoints;

    public Client(String name, String lastName, String userName, String password, String phoneNumber){
        super(name, lastName, userName, password, phoneNumber);
        adminStatus = false;
        totalPoints = 0;
    }

    public void setAdminStatus(Boolean adminStatus) { this.adminStatus = adminStatus; }
    public Boolean getAdminStatus() { return adminStatus; }

    public void rentVehicle(Vehicle vehicle){


    }



}

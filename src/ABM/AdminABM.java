package ABM;

import Database.*;
import Members.*;

public class AdminABM {

    private MemberDatabase memberDatabase;
    private VehicleDatabase vehicleDatabase;

    public AdminABM(MemberDatabase memberDatabase) {
        this.memberDatabase = memberDatabase;
    }

    public void removeFromABM(String username) {
        Administrator anAdmin = memberDatabase.findAdmin(username);
        memberDatabase.removeAdmin(username);
        User aUser= new User(anAdmin.getUsername(), anAdmin.getPhoneNumber());
        memberDatabase.addUser(username, aUser);
    }

    public void addToABM(String username) {
        User aUser = memberDatabase.findUser(username);
        memberDatabase.removeUser(username);
        Administrator anAdmin = new Administrator(aUser.getUsername(), aUser.getPhoneNumber(), this, memberDatabase, vehicleDatabase);
        memberDatabase.addAdmin(username, anAdmin);
    }


}
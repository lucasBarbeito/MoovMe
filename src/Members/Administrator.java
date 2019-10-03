package Members;

import ABM.ABM;

public class Administrator extends User {

    ABM abm;

    public Administrator(String firstName,String lastName, String userName, String password, String phoneNumber){
        super(firstName, lastName, userName, password, phoneNumber);
        adminStatus = true;
    }

    // public void setAdminStatus(Boolean adminStatus) { this.adminStatus = adminStatus; }
    public Boolean getAdminStatus() { return adminStatus; }

    public void deleteUserWhenBecomeAdministrator(){

    }


}

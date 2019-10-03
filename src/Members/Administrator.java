package Members;

import Zone.Zone;

public class Administrator extends User {

    protected Zone zone;

    public Administrator(String firstName,String lastName, String userName, String password, String phoneNumber){
        super(firstName, lastName, userName, password, phoneNumber);
        adminStatus = true;
    }

    // public void setAdminStatus(Boolean adminStatus) { this.adminStatus = adminStatus; }
    public Boolean getAdminStatus() { return adminStatus; }

    public void deleteUserWhenBecomeAdministrator(){

    }


}

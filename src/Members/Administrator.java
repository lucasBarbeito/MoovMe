package Members;

public class Administrator extends User {


    public Administrator(String name,String lastName, String userName, String password, String phoneNumber){
        super(name, lastName, userName, password, phoneNumber);
        adminStatus = true;
    }

    // public void setAdminStatus(Boolean adminStatus) { this.adminStatus = adminStatus; }
    public Boolean getAdminStatus() { return adminStatus; }

//hhhhhhhhhhhhhhh

}

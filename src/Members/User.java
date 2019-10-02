package Members;

public class User extends Users{

    private Boolean adminStatus;

    public User(String name,String lastName, String userName, String password, String phoneNumber){
        super(name, lastName, userName, password, phoneNumber);
        adminStatus = false;
    }

    public void setAdminStatus(Boolean adminStatus) { this.adminStatus = adminStatus; }
    public Boolean getAdminStatus() { return adminStatus; }


}

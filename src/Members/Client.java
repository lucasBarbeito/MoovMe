package Members;

public class Client extends Users{

    private Boolean adminStatus;

    public Client(String name, String lastName, String userName, String password, String phoneNumber){
        super(name, lastName, userName, password, phoneNumber);
        adminStatus = false;
    }

    public void setAdminStatus(Boolean adminStatus) { this.adminStatus = adminStatus; }
    public Boolean getAdminStatus() { return adminStatus; }

    //  puto el que lee


}

package Members;

public class User {

    protected String firstName;
    protected String lastName;
    protected String userName;
    protected String password;
    protected String phoneNumber;
    protected Boolean adminStatus;


    public User(String firstName, String lastName, String userName, String password, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.adminStatus = false;
    }

    public String getName() { return firstName;}
    public String getLastName() {
        return lastName;
    }
    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }



}

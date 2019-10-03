package Members;

public class User {

    protected String name;
    protected String lastName;
    protected String userName;
    protected String password;
    protected String phoneNumber;
    protected Boolean adminStatus;


    public User(String name, String lastName, String userName, String password, String phoneNumber){
        this.name = name;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public String getName() { return name;}
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

package Members;

public abstract class Users {

    private String name;
    private String lastName;
    private String userName;
    private String password;
    private String phoneNumber;

    public Users(){}

    public Users(String name,String lastName, String userName, String password, String phoneNumber){
        this.name = name;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }
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

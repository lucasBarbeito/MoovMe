import Members.User;

public class Registracion {

    public User registerAClient(String name, String lastName, String userName, String password, String phoneNumber){
        return new User(name,lastName, userName, password,phoneNumber);
    }
}

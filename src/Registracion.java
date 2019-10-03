import Members.Client;

public class Registracion {

    public Client registerAClient(String name, String lastName, String userName, String password, String phoneNumber){
        return new Client(name,lastName, userName, password,phoneNumber);
    }
}

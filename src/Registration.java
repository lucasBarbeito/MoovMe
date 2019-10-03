import BaseDeDatos.BaseDeDatos;
import Members.User;

public class Registration {

    public void registerClient(String name, String lastName, String userName, String password, String phoneNumber){
        User user = new User(name,lastName, userName, password,phoneNumber);
        BaseDeDatos.addUser(user);
    }



}

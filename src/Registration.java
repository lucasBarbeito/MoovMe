import BaseDeDatos.BaseDeDatos;
import Members.User;

public class Registration {

    public void registerClient(String firstName, String lastName, String userName, String password, String phoneNumber){
        User user = new User(firstName, lastName, userName, password, phoneNumber);
        BaseDeDatos.addUser(user);
    }



}

package ABM;

import BaseDeDatos.BaseDeDatos;
import Members.Administrator;
import Members.User;

public class ABM {

    static void upgradeToAdministrator(User user){
        Administrator newAdministrator = new Administrator(user.getFirstName(),
                user.getLastName(), user.getUserName(), user.getPassword(),
                user.getPhoneNumber());
        BaseDeDatos.addUser(newAdministrator);
        deleteUser(user);
    }

    static void downgradeToUser(Administrator administrator){
        User newUser = new User(administrator.getFirstName(),
                administrator.getLastName(), administrator.getUserName(), administrator.getPassword(),
                administrator.getPhoneNumber());
        BaseDeDatos.addUser(newUser);
        deleteUser(administrator);
    }

    static void deleteUser(User user){
        BaseDeDatos.removeUser(user);
    }

    static void blockUser(User user){

    }


}

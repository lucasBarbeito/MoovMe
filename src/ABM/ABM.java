package ABM;

import Members.Administrator;
import Members.User;

public class ABM {

    static Administrator upgradeToAdministrator(User user){
        Administrator newAdministrator = new Administrator(user.getName(),
                user.getLastName(), user.getUserName(), user.getPassword(),
                user.getPhoneNumber());
        // Hay que eliminar el user, para que una persona no tenga dos cuentas a la vez
        return newAdministrator;
    }

    static User downgradeToUser(Administrator administrator){
        User newUser = new User(administrator.getName(),
                administrator.getLastName(), administrator.getUserName(), administrator.getPassword(),
                administrator.getPhoneNumber());
        // Hay que eliminar el administrador, para que una persona no tenga dos cuentas a la vez
        return newUser;
    }

    static void deleteUser(User user){
        //Goes to data base and deletes user.
    }

    static void blockUser(User user){

    }


}

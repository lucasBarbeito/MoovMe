package ABM;

import Members.Administrator;
import Members.User;

public class ABM {

    static Administrator upgradeToAdministrator(User user){
        Administrator newAdministrator = new Administrator(user.getName(),
                user.getLastName(), user.getUserName(), user.getPassword(),
                user.getPhoneNumber());
        return newAdministrator;
    }

    static User downgradeToUser(Administrator administrator){
        User newUser = new User(administrator.getName(),
                administrator.getLastName(), administrator.getUserName(), administrator.getPassword(),
                administrator.getPhoneNumber());
        return newUser;
    }

    static void deleteUser(User user){
        //Goes to data base and deletes user.
    }

    static void blockUser(User user){

    }


}

package ABM;

import Members.Administrator;
import Members.User;

public class ABM {

    Administrator upgradeToAdministrator(User user){
        Administrator newAdministrator = new Administrator(user.getName(),
                user.getLastName(), user.getUserName(), user.getPassword(),
                user.getPhoneNumber());
        return newAdministrator;
    }
}

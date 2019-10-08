package ABM;

import Members.Administrator;
import Members.User;

public class UserABM extends ABM {

    public void upgradeToAdministrator(User user){
        Administrator newAdministrator = new Administrator(user.getFirstName(),
                user.getLastName(), user.getUserName(), user.getPhoneNumber());
        add(newAdministrator);
        remove(user);
    }

    public void downgradeToUser(Administrator administrator){
        User newUser = new User(administrator.getFirstName(),
                administrator.getLastName(), administrator.getUserName(), administrator.getPhoneNumber());
        add(newUser);
        remove(administrator);
    }

    public void blockUser(User user) {
        // bloquea a un usuario
    }

}

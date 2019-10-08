package ABM;

import Members.Administrator;
import Members.User;

public class UserABM extends ABM {

    public void upgradeToAdministrator(User user){
        Administrator newAdministrator = new Administrator(user.getName(),
                user.getLastName(), user.getUserName(), user.getPassword(),
                user.getPhoneNumber());
        add(newAdministrator);
        remove(user);
    }

    public void downgradeToUser(Administrator administrator){
        User newUser = new User(administrator.getName(),
                administrator.getLastName(), administrator.getUserName(), administrator.getPassword(),
                administrator.getPhoneNumber());
        add(newUser);
        remove(administrator);
    }

    public void blockUser(User user) {
        // bloquea a un usuario
    }

}
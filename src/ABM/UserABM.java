package ABM;

import Members.Administrator;
import Members.User;
import java.util.ArrayList;

public class UserABM extends ABM<User> {

    ArrayList<User> blockedUsers;

    public UserABM(int initialNumberOfUsers, int initialNumberOfBlockedUsers) {
        super(initialNumberOfUsers);
        blockedUsers = new ArrayList<User>(initialNumberOfBlockedUsers);
    }

    public void upgradeToAdministrator(User user){
        Administrator newAdministrator = new Administrator(user.getFirstName(),
                user.getLastName(), user.getPhoneNumber(), user.getUserId());
        add(newAdministrator);
        remove(user);
    }

    public void downgradeToUser(Administrator administrator){
        User newUser = new User(administrator.getFirstName(),
                administrator.getLastName(), administrator.getPhoneNumber(), administrator.getUserId());
        add(newUser);
        remove(administrator);
    }

    public void blockUser(User user) {
        blockedUsers.add(user);
    }

    public void unblockUser(User user) {
        blockedUsers.remove(user);
    }

    public void printAllUsers() {
        for (User aUser: list) {
            System.out.print(aUser.getFirstName() + " ");
            System.out.print(aUser.getLastName() + " ");
            System.out.println(aUser.getPhoneNumber());
        }
    }

}
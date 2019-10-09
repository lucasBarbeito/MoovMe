package ABM;

import Members.Administrator;
import Members.User;
import java.util.ArrayList;

public class UserABM extends ABM<User> {

    private ArrayList<User> blockedUsers;

    public UserABM(int initialNumberOfUsers, int initialNumberOfBlockedUsers) {
        super(initialNumberOfUsers);
        blockedUsers = new ArrayList<User>(initialNumberOfBlockedUsers);
    }

    public void upgradeToAdministrator(User user) {
        Administrator newAdministrator = new Administrator(user.getUserName(), user.getPhoneNumber(), user.getUserId());
        add(newAdministrator);
        remove(user);
    }

    public void downgradeToUser(Administrator administrator){
        User newUser = new User(administrator.getUserName(), administrator.getPhoneNumber(), administrator.getUserId());
        add(newUser);
        remove(administrator);
    }

    public void blockUser(User user) {
        blockedUsers.add(user);
    }

    public void unblockUser(User user) {
        blockedUsers.remove(user);
    }

    public void removeUserById(int userId) {
        for (User userToDelete: list) {
            if(userToDelete.getUserId() == userId) {
                remove(userToDelete);
            }
        }
    }

    public void printAllUsers() {
        for (User aUser: list) {
            System.out.print(aUser.getUserName() + " ");
            System.out.print(aUser.getPhoneNumber() + " ");
            System.out.println(aUser.getUserId());
        }
    }

}
import ABM.UserABM;
import Members.User;

public class Registration {

    public void registerUser(String firstName, String lastName, String userName, String phoneNumber, UserABM userABM) {
        User user = new User(firstName, lastName, userName, phoneNumber);
        userABM.add(user);
    }

}

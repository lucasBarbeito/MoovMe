import ABM.UserABM;
import IDGenerator.IdGenerator;
import Members.User;

public class Registration {

    public void registerUser(String firstName, String lastName, String phoneNumber, UserABM userABM) {
        User user = new User(firstName, lastName, phoneNumber, IdGenerator.getNewUserId());
        userABM.add(user);
    }

}
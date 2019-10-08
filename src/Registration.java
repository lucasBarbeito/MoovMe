import ABM.UserABM;
import IDGenerator.IdGenerator;
import Members.User;

public class Registration {

    public void registerUser(String firstName, String lastName, String phoneNumber, UserABM userABM, String userName) {
        User user = new User(firstName, lastName, phoneNumber, IdGenerator.getNewUserId(), userName);
        userABM.add(user);
    }

}
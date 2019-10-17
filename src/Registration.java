import Database.UserDatabase;
import Members.User;

public class Registration {

    private UserDatabase userDatabase;

    public Registration(UserDatabase userDatabase) {
        this.userDatabase = userDatabase;
    }

    public void registerUser(String username, String phoneNumber) {
        if (userDatabase.find(phoneNumber) == true) {
            throw new RuntimeException("This number is already registered.");
        } else {
            userDatabase.add(username, new User(username, phoneNumber));
        }
    }
}
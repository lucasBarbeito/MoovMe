import Database.UserDatabase;
import Members.User;

public class Registration {

    private UserDatabase userDatabase;

    public Registration(UserDatabase userDatabase) {
        this.userDatabase = userDatabase;
    }

    public void registerUser(String username, String phoneNumber) {
        userDatabase.add(username, new User(username, phoneNumber));
    }

}
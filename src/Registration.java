import Database.MemberDatabase;
import Members.User;

public class Registration {

    private MemberDatabase memberDatabase;

    public Registration(MemberDatabase memberDatabase) {
        this.memberDatabase = memberDatabase;
    }

    public void registerUser(String username, String phoneNumber) {
        memberDatabase.addUser(username, new User(username, phoneNumber));
    }

}
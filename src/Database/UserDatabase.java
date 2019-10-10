package Database;

import Members.User;

public class UserDatabase extends Database<String, User>{

    public UserDatabase() {
        super();
    }

    @Override
    public void printData() {
        for (User aUser : hashmap.values()) {
            System.out.println(aUser.getUsername() + " // " + aUser.getPhoneNumber() + " // isBlocked: " + aUser.getBlockedStatus());
        }
    }


}

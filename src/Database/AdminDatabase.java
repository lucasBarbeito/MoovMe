package Database;
import Members.Administrator;

public class AdminDatabase extends Database<String, Administrator> {

    public AdminDatabase() {
        super();
    }

    @Override
    public void printData() {
        for (Administrator anAdmin : hashmap.values()) {
            System.out.println(anAdmin.getUsername() + " // " + anAdmin.getPhoneNumber() + " // isBlocked: " + anAdmin.getBlockedStatus());
        }
    }


}

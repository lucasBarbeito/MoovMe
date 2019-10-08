import ABM.UserABM;
import Members.User;

public class MoovMeTest {

    public static void main(String[] args) {
        UserABM userABM = new UserABM(10, 0);
        Registration registrationSystem = new Registration();

        registrationSystem.registerUser("Jorge", "Lopez", "1169696969", userABM);
        registrationSystem.registerUser("Maia", "Camarero", "1101010101", userABM);

        System.out.println("Antes de botar a Jorge");
        userABM.printAllUsers();
    }

}

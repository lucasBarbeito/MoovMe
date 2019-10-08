import ABM.UserABM;
import Members.User;

public class MoovMe {

    public static void main(String[] args) {
        UserABM userABM = new UserABM(10, 0);
        Registration registrationSystem = new Registration();

        registrationSystem.registerUser("Jorge", "Lopez", "1169696969", userABM);
        registrationSystem.registerUser("Maia", "Camarero", "1101010101", userABM);
        registrationSystem.registerUser("Dimi", "AAA", "1133691847", userABM);

        System.out.println("Antes de botar a Jorge");
        userABM.printAllUsers();

        System.out.println(" ");
        System.out.println("Despues de botar a Jorge");
        userABM.removeUserById(2); // Si es 1 en vez de 2, hay que ver que pasa
        userABM.printAllUsers();
    }

}

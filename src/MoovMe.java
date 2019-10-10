import ABM.AdminABM;
import Database.AdminDatabase;
import Database.UserDatabase;
import Members.Administrator;

public class MoovMe {

    public static void main(String[] args) {
        UserDatabase userDatabase = new UserDatabase();
        AdminDatabase adminDatabase = new AdminDatabase();
        AdminABM adminABM = new AdminABM(userDatabase, adminDatabase);
        Registration userRegister = new Registration(userDatabase);
        Administrator dimi = new Administrator("Georges47", "1133691847", adminABM, userDatabase);
        adminDatabase.add(dimi.getUsername(), dimi);
        userRegister.registerUser("PapiJorge69", "1169696969");
        userRegister.registerUser("MaiMai420", "1122223333");
        userRegister.registerUser("Ape" , "119889898989");

        System.out.println("Printing admins data:");
        adminDatabase.printData();
        System.out.println(" ");
        System.out.println("Printing users data:");
        userDatabase.printData();


        System.out.println(" ");
        dimi.blockUser("PapiJorge69");
        System.out.println("After blocking PapiJorge69:\n");

        System.out.println("Printing admins data:");
        adminDatabase.printData();
        System.out.println(" ");
        System.out.println("Printing users data:");
        userDatabase.printData();


        System.out.println(" ");
        dimi.unblockUser("PapiJorge69");
        System.out.println("After unblocking PapiJorge69:\n");

        System.out.println("Printing admins data:");
        adminDatabase.printData();
        System.out.println(" ");
        System.out.println("Printing users data:");
        userDatabase.printData();


        System.out.println(" ");
        dimi.upgradeToAdmin("PapiJorge69");
        System.out.println("After upgrading PapiJorge69 to admin:\n");

        System.out.println("Printing admins data:");
        adminDatabase.printData();
        System.out.println(" ");
        System.out.println("Printing users data:");
        userDatabase.printData();


    }

}

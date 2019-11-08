import Database.MemberDatabase;
import Database.TerminalDatabase;
import Database.VehicleDatabase;
import Database.ZoneDatabase;
import IdGenerator.IdGenerator;
import Interfaces.AdministratorInterface;
import Interfaces.UserInterface;
import Members.Administrator;
import Members.User;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class MoovMe {

    static MemberDatabase memberDatabase;
    static TerminalDatabase terminalDatabase;
    static VehicleDatabase vehicleDatabase;
    static ZoneDatabase zoneDatabase;
    static IdGenerator idGenerator;
    static UserInterface userInterface;
    static AdministratorInterface administratorInterface;
    static User user;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        LocalTime start = LocalTime.now();
        LocalTime end = start.plusSeconds(170);
        Duration aDuration = Duration.between(start, end);


        logInUser();
        int i = 0;
        do{
            if (user instanceof Administrator){
                administratorInterface.printMenu();
            }else{
                userInterface.printMenu();
            }
            System.out.println("Select Option");
            i = scanner.nextInt();
        }while(i != 0);



        //System.out.println(start);
        //System.out.println(end);
        //System.out.println(aDuration.getSeconds() / 60.0 );
    }

    private static void logInUser() {
        User newUser;
        do{
            System.out.println("Insert phone number: ");
            String phoneNumber = scanner.nextLine();
            newUser = memberDatabase.findUser(phoneNumber);
        } while(newUser == null);
        user = newUser;
    }




}

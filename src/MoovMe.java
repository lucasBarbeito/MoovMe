import Database.MemberDatabase;
import Database.TerminalDatabase;
import Database.VehicleDatabase;
import Database.ZoneDatabase;
import IdGenerator.IdGenerator;
import Interfaces.UserInterface;
import Members.User;

import java.time.Duration;
import java.time.LocalTime;

public class MoovMe {

    MemberDatabase memberDatabase;
    TerminalDatabase terminalDatabase;
    VehicleDatabase vehicleDatabase;
    ZoneDatabase zoneDatabase;
    IdGenerator idGenerator;
    UserInterface userInterface;
    User user;

    public static void main(String[] args) {

        LocalTime start = LocalTime.now();
        LocalTime end = start.plusSeconds(170);
        Duration aDuration = Duration.between(start, end);

        /*
        do{

        }while(isSignedIn );

        do{
        int i =


        }while (i = 0)
        */


        //System.out.println(start);
        //System.out.println(end);
        //System.out.println(aDuration.getSeconds() / 60.0 );
    }




}

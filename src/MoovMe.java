import Manager.TerminalManager;
import Manager.UserManager;
import Database.MemberDatabase;
import Database.TerminalDataBase;
import Registration.IdGenerator;
import Members.Administrator;
import Members.User;
import Registration.Registrator;

public class MoovMe {

    public static void main(String[] args) {

        IdGenerator idGenerator = new IdGenerator();
        MemberDatabase memberDatabase = new MemberDatabase();
        TerminalDataBase terminalDataBase = new TerminalDataBase();
        Registrator registrator = new Registrator(memberDatabase, idGenerator, terminalDataBase );
        UserManager u = new UserManager(memberDatabase, registrator);
        TerminalManager terminalManager = new TerminalManager(terminalDataBase, idGenerator);

        Administrator a = new Administrator(new User("aaa", "1223"), u, terminalManager);

        System.out.println(a.getUsername());

    }

}

import Manager.TerminalManager;
import Manager.UserManager;
import Database.MemberDatabase;
import Database.TerminalDataBase;
import IdGenerator.IdGenerator;
import Members.Administrator;
import Members.User;

public class MoovMe {

    public static void main(String[] args) {

        IdGenerator idGenerator = new IdGenerator();
        MemberDatabase memberDatabase = new MemberDatabase();
        TerminalDataBase terminalDataBase = new TerminalDataBase();
        UserManager u = new UserManager(memberDatabase, idGenerator);
        TerminalManager terminalManager = new TerminalManager(terminalDataBase, idGenerator);

        Administrator a = new Administrator(new User("aaa", "1223"), u, terminalManager);

        System.out.println(a.getUsername());

    }

}

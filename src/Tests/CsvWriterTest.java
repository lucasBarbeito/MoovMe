package Tests;

import BaseDeDatos.CsvWriter;
import Members.User;
import org.junit.Test;

import java.util.ArrayList;

public class CsvWriterTest {

    @Test
    public  void writeCsvFile() {
        CsvWriter csvWriter = new CsvWriter();
        User user1 = new User("lucas", "Barbeito", "4598", 1);
        User user2 = new User("maia", "camarero", "458", 2);
        User user3 = new User("dimi", "stefan", "45982", 3);
        User user4 = new User("jorge", "lopez", "459856", 4);
        ArrayList<User> usuarios = new ArrayList<>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);

        csvWriter.writeCsvFile("usuariosNdhea", usuarios);

    }
}
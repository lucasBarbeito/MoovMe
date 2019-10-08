package Tests;

import BaseDeDatos.CsvWriter;
import Members.User;
import org.junit.Test;

import java.util.ArrayList;

public class CsvWriterTest {

    @Test
    public  void writeCsvFile() {
        CsvWriter csvWriter = new CsvWriter();
        User user1 = new User("lucas", "Barbeito", "4598", 1, "putoelquelee");
        User user2 = new User("maia", "camarero", "458", 2, "kkconpan");
        User user3 = new User("dimi", "stefan", "45982", 3, "helicopterodeatake");
        User user4 = new User("jorge", "lopez", "459856", 4, "maila+kpa");
        ArrayList<User> usuarios = new ArrayList<>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);

        csvWriter.writeCsvFile("usuariosNdhea", usuarios);

    }
}
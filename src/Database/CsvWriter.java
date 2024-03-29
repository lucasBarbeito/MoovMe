package Database;

import Members.User;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CsvWriter {

    public  void writeCsvFile(String fileName, ArrayList<User> users){

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);

            for (User user: users) {
                fileWriter.append(user.toString());
                fileWriter.append("\n");
            }

            System.out.println("The file creation succeed.");

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

            try {
                assert fileWriter != null;
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter");
                e.printStackTrace();
            }
        }
    }
}

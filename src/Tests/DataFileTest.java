package Tests;
import java.io.*;
public class DataFileTest {

    public static void main(String[] args) {

        File dataFile = new File("DataFile.txt");

        try{
            if(!dataFile.exists() ){

                dataFile.createNewFile();
            }
            PrintWriter pw = new PrintWriter(dataFile);

            pw.print("This is the data for this MoovMe app");

            pw.close();

            System.out.println("done");

        } catch(IOException e ){

            e.printStackTrace();
        }

//        dataFile.delete();
    }

    public void deleteFile(File file){
        if(file.exists()){
            file.delete();
        } else{
            throw new RuntimeException("There is no file");
        }
    }
}

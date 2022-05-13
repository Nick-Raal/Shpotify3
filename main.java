import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    ArrayList<Song> listOfLinks = new ArrayList<Song>();
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
        try{
            FileWriter fw = new FileWriter(new File("Storage.dat"), true);
            
            fw.write("\n"+scan.nextLine());
            fw.close();
        } catch (Exception e){
            System.out.println("There was an error reading the file" + e.getMessage());
        }
    }
}

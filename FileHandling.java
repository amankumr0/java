import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        File f1 = new File("newFile23.txt");
        try {
            f1.createNewFile();
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println("Unable to creat a file");
            e.printStackTrace();
        }
    }
    
}

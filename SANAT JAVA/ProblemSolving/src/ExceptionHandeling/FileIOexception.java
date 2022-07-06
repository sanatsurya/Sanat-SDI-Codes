package ExceptionHandeling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOexception {
    public static void findFile() throws IOException{
        File newfile = new File("C:\\Users\\ESC202204JAVA09\\Documents\\main.txt");
//        File newfile = new File("C:\\ESC202204JAVA09\\Documents\\main.txt");
        FileInputStream stream = new FileInputStream(newfile);
        stream.read();
    }

    public static void main(String[] args) {
        try {
            findFile();
            System.out.println("File is found");

        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Plik {
    public static void newLine(String text, String fileName) {
        try{
            BufferedWriter w = new BufferedWriter(new FileWriter(fileName, true));
            w.newLine();
            w.write(text + "\n");
            w.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }        
    }

    public static void main(String[] args) {
        newLine(":)", "test.txt");
    }
}

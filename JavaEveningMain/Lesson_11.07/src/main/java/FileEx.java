import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileVisitResult;

public class FileEx {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("file.txt");) {
            int ch;
            while ((ch = fileReader.read()) != -1) {
                System.out.print((char) ch);

            }
            System.out.println("\n");
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

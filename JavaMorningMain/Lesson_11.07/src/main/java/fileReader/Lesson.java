package fileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lesson {
    public static void main(String[] args) throws FileNotFoundException {
        try (FileReader fileReader = new FileReader("wpe.txt")) {
            int characters;
            while ((characters = fileReader.read()) != -1) {  // пока мы не достигли конца фаила
                System.out.println((char) characters);
            }
            System.out.println("\n");
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


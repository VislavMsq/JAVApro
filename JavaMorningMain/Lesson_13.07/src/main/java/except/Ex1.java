package except;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex1 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("wpe.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("!!!");
        }

    }
}

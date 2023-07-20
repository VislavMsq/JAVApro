package except;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PictureIncorretFormatException extends RuntimeException {
    PictureIncorretFormatException(String massage) {
        super(massage);
    }
}

class main {
    /**
     *
     * @param path path to file
     * @throws IOException if file doesent exist
     */
    public void readPictures(String path) throws IOException {
        FileReader fileReader = new FileReader("wpe.txt");
        int characters;

        while ((characters = fileReader.read()) != -1) {  // пока мы не достигли конца фаила
            System.out.println((char) characters);
        }
        System.out.println("\n");
        System.out.println("Done!");

    }

//    public static void main(String[] args) {
//        new Main().readPictures("");
//
//    }
}

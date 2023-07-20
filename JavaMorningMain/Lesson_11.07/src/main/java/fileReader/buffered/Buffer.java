package fileReader.buffered;

import java.io.*;

public class Buffer {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("wpe.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("bufferedWriter.txt"))) {

//            int character;
//            while((character = reader.read()) != -1){
//                writer.write(character);
//            } первый способ

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\r"); // перенос на новую строку
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

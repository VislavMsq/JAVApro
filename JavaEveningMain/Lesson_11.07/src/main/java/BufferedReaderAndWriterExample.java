import java.io.*;

public class BufferedReaderAndWriterExample {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("fileEx2.txt"))){

//           int ch;
//           while ((ch = reader.read() != -1)){                // return int
//               writer.write(ch);
//           }

            String line;
            while ((line = reader.readLine()) != null) {        //return String
                writer.write(line + "\n");
            }

            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

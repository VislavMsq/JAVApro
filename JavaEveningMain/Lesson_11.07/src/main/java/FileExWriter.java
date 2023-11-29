import java.io.FileWriter;
import java.io.IOException;

public class FileExWriter {
    public static void main(String[] args) {
        String str = "Ключевым понятием здесь является понятие потока. Хотя понятие \"поток\" в программировании " +
                "довольно перегружено и может обозначать множество различных концепций. В данном случае применительно " +
                "к работе с файлами и вводом-выводом мы будем говорить о потоке (stream), как об абстракции, которая " +
                "используется для чтения или записи информации (файлов, сокетов, текста консоли и т.д.).";

        try (FileWriter fileWriter = new FileWriter("fileEx.txt");) {
            for (int i = 0; i < str.length(); i++) {
                fileWriter.write(str.charAt(i));
            }
            System.out.println("\n");
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

// читает фаил -> в лист int
// итает текст, делит по словам -> лист стрингов
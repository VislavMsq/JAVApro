import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class FileManager {

    // ["Объект, из которого можно считать данные, называется потоком ввода, а объект,", в который можно записывать данные, - потоком вывода. Например, если надо считать, содержание файла, то применяется поток ввода, а если надо записать в файл - то поток вывода.]


    public static void main(String[] args) {
        System.out.println(readIntAndCreateteList("int.txt"));

        System.out.println(readToWordList("str.txt"));

        System.out.println(readAndWriteLineWords("strLine.txt"));

        generateAndWrite("randomInt.txt");
    }

    public static List<Integer> readIntAndCreateteList(String filename) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            int num;
            StringBuilder stringBuilder = new StringBuilder();
            while ((num = bufferedReader.read()) != -1) {
                stringBuilder.append((char) num);
            }
            List<Integer> list = Stream.of(stringBuilder.toString().split(" "))
                    .map(Integer::parseInt)
                    .toList();
            return list;
            // str = "12 3 32"
            // >> 00000001
            // -> str += (char) num
            // [12,3,32]

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> readToWordList(String filename) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            int num;
            StringBuilder stringBuilder = new StringBuilder();
            while ((num = bufferedReader.read()) != -1) {
                stringBuilder.append((char) num);
            }
            List<String> list = List.of(stringBuilder.toString().split(" ")); // str[] -> List<str>
            return list;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // FileReader -> InputStreamReader -> Reader

    // BufferedReader(FileReader) -> Reader

    public static List<String> readAndWriteLineWords(String filename) {
        List<String> list = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
            String line;
//                StringBuilder stringBuilder = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
            return list;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void generateAndWrite(String filename) {
        Random rm = new Random();
        try {
            FileWriter fileWriter = new FileWriter(filename);
            for (int i = 0; i < 20; i++) {
                fileWriter.write(rm.nextInt(0, 101) + " ");
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

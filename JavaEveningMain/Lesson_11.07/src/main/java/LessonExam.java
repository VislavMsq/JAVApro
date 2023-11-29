import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LessonExam {

    public static void main(String[] args) {

// 1.1 random -> txt
// 1.2 read -> toInt

// читает перводит в стрингу + генерирует цифры -> .txt
// читает фаил -> в лист int

// читает текст, делит по словам -> лист стрингов



        System.out.println(readStringFile("file.txt"));

        randomWrite();

        System.out.println(readNumberFile("nums.txt")); // -> list["12", ...]


    }

    private static List<Integer> readNumberFile(String filename) {
        return readStringFile(filename).stream()
                .map(Integer::parseInt)
                .toList();
    }

    public static void randomWrite() {
        Random rm = new Random();
        try (FileWriter fileWriter = new FileWriter("nums.txt")) {
            for (int i = 0; i < 10; i++) {
                fileWriter.write(Integer.toString(rm.nextInt(0, 101)) + " " );
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    /*
    - Создать класс
    - стат метод генерации и записи интов в файл
    - метод чтения интов и записи его в лист
    //- метод чтения текста и записи отдельных слов в текст
    - метод чтения текста и записи отдельных строк в лист
    - подставить методы выше в задачи по стримам
     */

    public static List<String> readStringFile(String filename) {

        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                list.addAll(List.of(str.split(" ")));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return list;
    }

//    public static void readAndWriteInt() {
//        List<Integer> list = new ArrayList<>();
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"))) {
//            String str;
//            while ((str = bufferedReader.readLine()) != null) {
//                int num = Integer.parseInt(str);
//                list.add(num);
//            }
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Num -> " + list);
//    }

}

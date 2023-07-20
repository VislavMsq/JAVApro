package files;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileAndPathExample {
    public static void main(String[] args) {

        List<File> file = new ArrayList<>();
        getFile(new File("C:\\Users"), file);
        for (File file1 : file) {
            System.out.println("[" + file1.getAbsolutePath() + "]");
        }
        System.out.println("Files numbers is: " + file.size());
    }

    private static void getFile(File root, List<File> fileList) {
        if (root.isDirectory()) {
            System.out.println("searching...." + root.getAbsolutePath()); // смотрим что просматривает
            File[] directoryFiles = root.listFiles(); // возвращает массив адресов
            if (directoryFiles != null) {    // если не пусто, то нужно зайти в него
                for (File file : directoryFiles) {  // проходимся по массиву с файлами
                    if (file.isDirectory()) {   // если фаил директория
                        getFile(file, fileList); // (рекурсия) то передаем данные, т.е выводим адрес директории
                    } else {
                        if (file.getName().toLowerCase().endsWith(".txt")) ; // если не директори, то вроверям фаил, на тот, который мы ищем
                        { // если окончание .txt
                            fileList.add(file); // то добавить его в лист
                        }
                    }
                }
            }

        }
    }
}

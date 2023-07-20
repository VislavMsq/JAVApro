package files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathEx {
    public static void main(String[] args) {
        // \\ - экранирование, второй \ убирает силу первого и
        Path filePath = Paths.get("C:\\Users\\Tel-ran.de\\Desktop");

        System.out.println("File name: " + filePath.getFileName());
        System.out.println("Parent directory: " + filePath.getParent());
        System.out.println("Abs name: " + filePath.toAbsolutePath());

        Path subPath = filePath.subpath(0, 2); // пусть до файла и посмотреть какие пути к нему идут
        System.out.println("SubPath: " + subPath);

        boolean isExist = Files.exists(filePath);
        System.out.println("Is file exist: " + isExist);


    }
}

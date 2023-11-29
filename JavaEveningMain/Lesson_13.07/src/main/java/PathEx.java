import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathEx {
    public static void main(String[] args) {
        Path filePath = Paths.get("C:\\folder\\path.txt");

        System.out.println("File name: " + filePath.getFileName());
        System.out.println("Parent file: " + filePath.getParent());
        System.out.println("Abs path: " + filePath.toAbsolutePath());

        Path subPath = filePath.subpath(0, 2);
        System.out.println("Sub Path: " + subPath);

        boolean isExist = Files.exists(filePath);
        System.out.println("Is exist: " + isExist);

        Path newFilePath = Paths.get("C:\\folder\\pathTest.txt");
        try {
            Files.createFile(newFilePath);
            System.out.println("New file was created!");
        } catch (IOException e) {
            System.out.println("Cant create a file: " + e.getMessage());
        }

//        try {
//            Files.delete(newFilePath);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//            System.out.println("Cant delete a file: " + e.getMessage());
//        }
    }
}

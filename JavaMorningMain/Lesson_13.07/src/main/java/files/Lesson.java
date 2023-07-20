package files;

import java.io.File;
import java.io.IOException;

public class Lesson {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try {
            boolean created = file.createNewFile();
            if (created) {
                System.out.println("File was created: " + file.getAbsolutePath()); // где он находится
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("File name: " + file.getName());
        System.out.println("Path: " + file.getAbsolutePath());
        System.out.println("file size: " + file.length() + " byte");

        boolean isDirectory = file.isDirectory();
        System.out.println("Is Directory " + isDirectory);

        File renameFile = new File("rename.txt");
        boolean rename = file.renameTo(renameFile);
        if (rename) {
            System.out.println("File was renamed");
        }

        boolean deleted = renameFile.delete();
        if(deleted) {
            System.out.println("File was deleted");
        }


    }
}

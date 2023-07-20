package files;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class ImageDownloader {
    public static void main(String[] args) {
        String imageURL = "https://hostname.com// ";
        String savePATH = "C:\\folder.jpg";

        try {
            downloadImage(imageURL, savePATH);
            System.out.println("The pictures was downloaded adn saved");
        } catch (IOException e) {
            System.out.println("Download ERROR!!!");
        }
    }

    private static void downloadImage(String imageURL, String savePATH) throws IOException {
        URL url = new URL(imageURL);
        Path path = Path.of(savePATH);

        try (InputStream inputStream = url.openStream()) {
            Files.copy(inputStream, path, StandardCopyOption.REPLACE_EXISTING);
        }
    }
}

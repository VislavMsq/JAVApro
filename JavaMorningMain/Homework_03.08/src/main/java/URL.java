import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class URL {
    private static String readFile(String filename) {
        try (FileReader fileReader = new FileReader(filename)) {
            StringBuilder stringBuilder = new StringBuilder();
            int read;
            while ((read = fileReader.read()) != -1) {
                stringBuilder.append((char) read);
            }
            return stringBuilder.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> findAndReplace(String oldChar, String newChar, String filename) {
        Pattern pattern = Pattern.compile("http(|s)://(\\w|\\.|/)+\\b");
        Matcher matcher = pattern.matcher(readFile(filename));
        List<String> list = new ArrayList<>();

        while (matcher.find()) {
            list.add(matcher.group().replace(oldChar, newChar));
        }
        return list;
    }

}

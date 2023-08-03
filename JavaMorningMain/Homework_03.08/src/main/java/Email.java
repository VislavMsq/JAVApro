import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Email {
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

    public static Map<String, Long> parse(String filename) {
        Pattern pattern = Pattern.compile("(\\w|\\.)+@\\w+\\.[a-z]+\\b");
        Matcher matcher = pattern.matcher(readFile(filename));
        List<String> stringList = new ArrayList<>();
        while (matcher.find()) {
            stringList.add(matcher.group().split("@")[1]);
        }
        return stringList.stream()
                .collect(Collectors.groupingBy(str -> str, Collectors.counting()));
    }
}

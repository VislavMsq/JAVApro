import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Product {
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
        Pattern pattern = Pattern.compile("[A-Z0-9]+:\\d+\\b");
        Matcher matcher = pattern.matcher(readFile(filename));
        Map<String, Long> map = new HashMap<>();

        while (matcher.find()) {
            String[] arr = matcher.group().split(":");
            map.put(arr[0], Long.parseLong(arr[1]));
        }
        return map;
    }

    public static Map<String, Long> getMore(Map<String, Long> map, int n) {
        return map.entrySet().stream()
                .filter(el -> el.getValue() >= n)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public static Map<String, Long> getMore(String filename, int n) {
        return getMore(parse(filename), n);
    }
}

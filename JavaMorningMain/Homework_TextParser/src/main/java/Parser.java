import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Parser {


    public static List<String> read(String fileName) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            List<String> listParser = bufferedReader.lines()
                    .toList();
            listParser = listParser.stream()
                    .map(el -> el.replace("(CATEGORY)", ""))
                    .toList();

            return listParser;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Factory> parsElements(String filename) {
        List<String> readList = read(filename);
        List<Factory> factoryList = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\[.*?]");

        for (String s : readList) {
            List<String> stringList = new ArrayList<>();

            Matcher matcher = pattern.matcher(s);

            boolean a = true;

            while (matcher.find()) {
                if (a) {
                    a = false;
                    stringList.add(matcher.group().replace("[", "").replace("]", "")
                            .split("#")[1]);
                }

                stringList.add(matcher.group().replace("[", "").replace("]", "")
                        .split("#")[0]);
            }
            System.out.println(stringList);

            factoryList.add(
                    new Factory(
                            Integer.parseInt(stringList.get(0)),
                            stringList.get(3),
                            new Product(
                                    Integer.parseInt(stringList.get(0)),
                                    stringList.get(2),
                                    stringList.get(1),
                                    Integer.parseInt(stringList.get(4)),
                                    Boolean.parseBoolean(stringList.get(5)),
                                    Boolean.parseBoolean(stringList.get(6)),
                                    Float.parseFloat(stringList.get(7)),
                                    Float.parseFloat(stringList.get(8))
                            ),
                            Boolean.parseBoolean(stringList.get(9))
                    )
            );
        }
        return factoryList;
    }
}

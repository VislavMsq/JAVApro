import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Re1 {
    public static void main(String[] args) {
        String s = " A regular expression (RegEx22 in Java) is a pattern for searching for a string in text. In Java, " +
                "the initial representation@gmail.com of this pattern is always a string, that is, an object of class " +
                "String. However, not 2023 every string can be compiled 33 into a regular expression@gmail.com, but only one " +
                "that conforms@yahoo.com to the rules 123 for writing regular@gmail.com expressions, the syntax defined in the language " +
                "specification.";

//        Pattern pattern = Pattern.compile("\\b\\d{4}\\b");
//        Pattern pattern = Pattern.compile("\\+\\d{5}");
//        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(ru|com)"); // найти почту
        Pattern pattern = Pattern.compile("p(e)*");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println("Pos: " + matcher.start() + " : " + matcher.group());
        }
    }
}

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson {
    public static void main(String[] args) {
        String s = "ASD ASDF ASDGHJ A3SD9YUAERHVKEW";
//        Pattern pattern = Pattern.compile("[ASD]");
//        Pattern pattern = Pattern.compile("A[^ASD][A-Z]");
//        Pattern pattern = Pattern.compile("A[A-Z]D");
        Pattern pattern = Pattern.compile("ASD.");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + " : " + matcher.group());
        }
    }
}

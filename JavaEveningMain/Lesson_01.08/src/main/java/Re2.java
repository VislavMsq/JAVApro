import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Re2 {
    public static void main(String[] args) {
        String s = "ASD ASDF ASDGHJ A3SD9YUAER6HVKEW";
        Pattern pattern = Pattern.compile("A.+?A");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + " : " + matcher.group());
        }
    }
}

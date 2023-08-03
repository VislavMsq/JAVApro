import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 */
public class Re3 {
    public static void main(String[] args) {
        String st = "ABCD ABDC A1BCABCNCABCDBAHCBAGCA8BCD";
        Pattern pattern = Pattern.compile("\\w{3}");
        Matcher matcher = pattern.matcher(st);

        while (matcher.find()) {
            System.out.println("Pos: " + matcher.start() + " : " + matcher.group());
        }

    }
}

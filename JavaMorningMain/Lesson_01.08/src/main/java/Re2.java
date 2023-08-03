import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Re2 {
    /**
     * [] - диапозон
     * ^  - отрицание
     * $  - выражение в конце строки
     * .  - любой символ
     */
    public static void main(String[] args) {
//        String s = "ABCD ABDC ABCABCNCABCDBAHCBAGCABCD";
        String st = "OPAGTRSHDJASTA8TA9T";
//        Pattern pattern = Pattern.compile("A[^0-9A-C]T");
//        Pattern pattern = Pattern.compile("A[0-9]T.");
        Pattern pattern = Pattern.compile("A[A-Z]T");
        Matcher matcher = pattern.matcher(st);

        while (matcher.find()) {
            System.out.println("Pos: " + matcher.start() + " : " + matcher.group());
        }


    }
}

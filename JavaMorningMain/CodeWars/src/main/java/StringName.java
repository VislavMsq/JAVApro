import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StringName {
    public static void main(String[] args) {

        String[] arr = {"hello", "world", "this", "is", "great"};

        String.join("", arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
        System.out.println(smash(arr));
    }

    public static void areYouPlayingBanjo(String name) {
        if (name.startsWith("R") || name.startsWith("r")) {
            System.out.println(name + " plays banjo");
        } else {
            System.out.println(name + " does not play banjo");
        }
    }

    // ['hello', 'world', 'this', 'is', 'great']  =>  'hello world this is great'
    public static String smash(String... words) {
        // TODO Write your code below this comment please
        return String.join(" ", words);
    }
}

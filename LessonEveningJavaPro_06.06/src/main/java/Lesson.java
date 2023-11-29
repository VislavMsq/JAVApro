import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Lesson {
    public static void main(String[] args) {
        String[] s = {"QQ", "WW", "EE", "RR"};
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        for (String name : s) {
            System.out.println(name);
        }

        //              x = 5
        List<String> list = new ArrayList<>();
        list.add("QQ");
        list.add("AA");
        list.add("DD");
        list.add("RR");
        list.add("TT");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (String name : list) {
            System.out.println(name);
        }

        Set<String> set = new HashSet<>();
    }
}

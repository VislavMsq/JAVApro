import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test77 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Oksana", "Vlad", "Vadim");
//        for (String s : list){
//            System.out.println(s);
//        }

        list.forEach(System.out::println);
    }
}

package example1;

import java.util.HashSet;
import java.util.Set;

public class Task2 {
    // Реализуйте функцию на Java, которая принимает на вход строку и возвращает
// множество всех уникальных символов в этой строке. Регистр символов должен учитываться.
    public static void main(String[] args) {
        String lorem = "sed ut perspiciatis unde omnis iste natus error sit " +
                "voluptatem accusantium doloremque laudantium" ;


        for (char sh: getUniqueChar(lorem)) {
            System.out.print(sh + " ");
        }
    }

    public static Set<Character> getUniqueChar(String lorem) {
        Set<Character> set = new HashSet<>();
        for (char ch: lorem.toCharArray() ){
            set.add(ch);
        }
        return set;
    }
}

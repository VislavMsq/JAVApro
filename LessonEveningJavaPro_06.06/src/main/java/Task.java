import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Task {



    public static boolean isPalindrome(String text){
        List<Character> characters = new ArrayList<>();

        for (Character chr : text.toCharArray()) {
            characters.add(chr);
        }

        ListIterator<Character> iterator = characters.listIterator();
        ListIterator<Character> iterator2 = characters.listIterator(characters.size());

        int counter = characters.size() / 2;
        int count = 0;
        while(iterator.hasNext() && (counter > count)){

            if(iterator.next() != iterator2.previous()) {
                return false;
            }
            count++;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "omonomoq";

        System.out.println(isPalindrome(str));
    }
}

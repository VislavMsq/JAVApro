import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterEx2 {
    private static boolean isPal(String str) {
//        StringBuilder stringBuilder = new StringBuilder(str); // madam
//        String rev = String.valueOf(stringBuilder.reverse());
//        boolean b = rev.equals(str);
//        return b;




        System.out.println(isPalin("madam"));
        System.out.println(isPalin("madama"));




        boolean isPalindrome = true;
        int count = 0;
        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            characters.add(str.charAt(i));      // добавиди строку в лист
        }
        Iterator<Character> direct = characters.iterator();     //идем справа -> налево
        ListIterator<Character> reverse = characters.listIterator(characters.size ());    // с конца <- в начало
        while (direct.hasNext() && reverse.hasPrevious() && count < characters.size() / 2) {     // сравниваем первый и последний
            if (direct.next() != reverse.previous()){           // словие, если не равно, то фолс и выходим
                isPalindrome = false;
                break;
            }
            count++;        // записываем +1
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        String palindrome = "madam";
//        String notPalindrome = "mama";

        System.out.println(isPal(palindrome));
//        System.out.println(isPal(notPalindrome));
    }
    private static boolean isPalin(String s){
        // взяли строку, первернули ее потом сравнили ее через equals
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}

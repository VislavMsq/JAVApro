import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Напишите метод findWordsStartingWithLetter(List<String> words, char letter),<pre>
 * который будет принимать список строк words и символ letter, и возвращать новый
 * список, содержащий только те слова из исходного списка, которые начинаются с
 * заданной буквы letter. Используйте цикл for-each для перебора элементов списка
 * и условие startsWith() класса String для проверки начальной буквы.</pre>
 */

public class Task3 {
    public static void main(String[] args) {

        List<String> words = List.of("one", "two", "three");
        System.out.println(findWordsStartingWithLetter(words, 't'));
    }

    public static List<String> findWordsStartingWithLetter(List<String> words, char letter) {
        List<String> list = new ArrayList<>();
        for (String s : words) {
                if (s.startsWith(Character.toString(letter))) {
                list.add(s);
            }
        }
        return list;
    }
}

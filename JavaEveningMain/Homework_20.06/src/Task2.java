import java.util.List;

/**
 * Напишите метод findLongestWord(String[] words),<pre>
 * который будет принимать массив строк words и возвращать
 * самое длинное слово из массива. Для решения задачи используйте переменную
 * для хранения текущего самого длинного слова и обновляйте ее при нахождении
 * более длинного слова в массиве.</pre>
 */

public class Task2 {
    public static void main(String[] args) {
        String[] words = {"one two three", "four five"};
        //             = {      1        ,      2     }
        //             = {  1 , 2 ,   3 }, { 4  ,  5  }

        // cycle 1
        //         "one two three" -> ["one", "two", "three"]
        //         cycle
        //               "one", "two", "three"

        System.out.println(findLongestWord(words));
    }

    public static String findLongestWord(String[] words) {
        String str = ""; // переменна для хранения str
        for (String s : words) {
            String[] subStr = s.split(" "); // "one two three" -> ["one", "two", "three"]
            for (String s2 : subStr) {
                // сровнить розмер s и str
                if (s2.length() > str.length()) {
                    str = s2;
                }
            }
        }
        return str;
    }
}

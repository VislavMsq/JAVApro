/**
 * Напишите метод countWords(String[] words),<pre>
 * который будет принимать
 * массив строк words и возвращать количество слов в массиве.
 * Для решения задачи используйте метод split() класса String,
 * который разделяет строку на подстроки на основе заданного разделителя (пробела).
 * Подсчитайте количество полученных подстрок и верните результат.</pre>
 */

public class Task {
    public static void main(String[] args) {
        // 1.
        String[] arr = {"one two three"};
        System.out.println(countWords(arr));

        // 1.1
        String str = "one two three";
        String[] arr2 = str.split(" ");     // строку разбиваем по " " и записываем в новый массив
        System.out.println(arr2);
    }

    // 1
    public static int countWords(String[] arr) {
        int count = 0;
        for (String str : arr) {
            String[] s = str.split(" ");
            count += s.length;
        }
        return count;
    }
    // 1.1
    public static int countWords2(String[] str) {
        return str.length;
    }
}

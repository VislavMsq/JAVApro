package task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        String[] str = {"one two three","four wewewe"};

        System.out.println(getWord(str));

        System.out.println(findLongestWord(str));
    }

    /*
    Напишите метод countWords(String[] words),который будет принимать
    массив строк words и возвращать количество слов в массиве.
    Для решения задачи используйте метод split() класса String,
    который разделяет строку на подстроки на основе заданного разделителя (пробела).
    Подсчитайте количество полученных подстрок и верните результат.
    */
    public static int getWord(String[] words) {
        int count = 0;
        for (String str : words) {
            String[] s = str.split(" ");
            count += s.length;
        }
        return count;
    }

    /*
    Напишите метод findLongestWord(String[] words),
    который будет принимать массив строк words и возвращать
    самое длинное слово из массива. Для решения задачи используйте переменную
    для хранения текущего самого длинного слова и обновляйте ее при нахождении
    более длинного слова в массиве.
     */
    public static String findLongestWord(String[] words) {
        String word = "";
        for(String s : words){
            for (String s1 : s.split(" ")){
                if(s1.length() > word.length()){
                    word = s1;
                }
            }
        }
        return word;
    }
}

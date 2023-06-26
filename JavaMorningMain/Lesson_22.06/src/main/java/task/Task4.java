package task;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("lemon", "cat", "tac", "dog", "god", "man", "nam");

        System.out.println(findWordPairs(words));
    }

    /*
    - У вас есть список List<String>, содержащий слова.
    Напишите программу, которая находит все пары слов, в которых первое слово является обратным написанию второго слова.
    List<String> words = Arrays.asList("lemon", "cat", "tac", "dog", "god", "man", "nam");
     */
    public static List<String> findWordPairs(List<String> words) {
        List<String> pairs = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            String word1 = words.get(i);
            for (int j = i + 1; j < words.size(); j++) {
                String word2 = words.get(j);
                if (isReverse(word1, word2)) {
                    String pair = word1 + " - " + word2;
                    pairs.add(pair);
                }
            }
        }
        return pairs;
    }

    public static boolean isReverse(String word1, String word2) {
        StringBuilder reversedWord2 = new StringBuilder(word2).reverse();
        return word1.equals(reversedWord2.toString());
    }
}

package holidaysTask;


import java.util.ArrayList;
import java.util.List;

public class MainMain {
    public static void main(String[] args) {
        String[] strings = {"one", "two", "three", "four"};
        String string1 = "HeLLo WoRLd";
        String string2 = "Сьогодні гарний день у нашому місті";
        String string3 = "якийсь придуманий текст";
        String string4 = "Якийсь текст";
        // 1.
        System.out.println(checkCountVowels(strings));
        // 2.
        System.out.println(reverseCase(string1));
        // 3.
        System.out.println(longestWord(string2));
        // 4.
        System.out.println(toCamelCase(string3));
        // 5.
        System.out.println(reverseWords(string3));
    }

    // 1.  пройтись по строці і вивести кількість голосних літер в алфавіті "[a|e|i|o|u]"
    public static int checkCountVowels(String[] str) {
        List<Character> list = List.of('a', 'e', 'i', 'o', 'u');
        int count = 0;

        for (String s : str) {
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (list.contains(c)) {
                    count++;
                }
            }
        }
        return count;
    }

    // 2. reverseCase: "HeLLo WoRLd" -> "hEllO wOrlD"
    public static String reverseCase(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : str.split("")) {
            if (s.matches("[A-Z]")) {
                stringBuilder.append(s.toLowerCase());
            } else {
                stringBuilder.append(s.toUpperCase());
            }
        }
        return stringBuilder.toString();
    }

    // 3. longestWord: "[Сьогодні, гарний, день, у ,нашому, місті]" -> "Сьогодні"
    public static String longestWord(String str) {
        String longStr = "";
        for (String s : str.split(" ")) {
            if (s.length() > longStr.length()) {
                longStr = s;
            }
        }
        return longStr;
    }

    // 4.  toCamelCase: "якийсь придуманий текст" -> "якийсьПридуманийТекст" || п.toUpperCase() + ридуманий
    public static String toCamelCase(String str) {
        String[] s = str.split(" ");
        if (s.length <= 1) {
            return str;
        }

        StringBuilder stringBuilder = new StringBuilder(s[0]);
        for (int i = 1; i < s.length; i++) {
            stringBuilder.append(
                    s[i].substring(0, 1).toUpperCase() + s[i].substring(1).toLowerCase()
            );
        }
        return stringBuilder.toString();
    }

    // 5.  переворот слів зі збереженням порядку "Якийсь текст" -> "ьсйикЯ тскет"
    public static String reverseWords(String str) {
        String[] s = str.split(" ");
        List<String> strings = new ArrayList<>();
        for (String st : s) {
            strings.add(new StringBuilder(st).reverse().toString());
        }
        return String.join(" ", strings);
    }
}

import java.util.*;

public class Task {
    public static void main(String[] args) {
        Map<String,Boolean> map = new HashMap<>();
        map.put("Bill", false);
        map.put("Kate", true);
        map.put("John", true);
        map.put("Vlad", false);
        // 1.
        System.out.println(getNameStudent(map));

        // 2.
        System.out.println(getProd(map));

        // 3.
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank");
        System.out.println(getPrefName(names, 'C'));

        // 4.
        List<String> words = Arrays.asList("lemon", "cat", "tac", "dog", "god", "man", "nam");
        System.out.println(findWordPairs(words));
    }
// region 1.У вас есть Map<String, Boolean>, представляющая студентов и их оценки (true - сдал экзамен, false - не сдал).
// Напишите функцию, которая находит и возвращает имена студентов, не сдавших экзамен.

//
    public static List<String> getNameStudent(Map<String, Boolean> map){
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Boolean> entry : map.entrySet()){
            if (!entry.getValue()){ // инвертирование значения value
                list.add(entry.getKey());
            }
        }
        return list;
    }
    // endregion
// region 2.У вас есть Map<String, Boolean>, представляющая список продуктов в магазине и информацию о их наличии (true - продукт в наличии, false - продукта нет).
//Напишите функцию, которая подсчитывает количество продуктов, которых нет в наличии.
    public static int getProd(Map<String, Boolean> map){
        int calc = 0;
        for (Map.Entry<String, Boolean> entry : map.entrySet()){
            if(!entry.getValue()){
                calc++;
            }
        }
        return calc;
    }
    // endregion
// region 3.У вас есть список List<String>, содержащий имена людей. Напишите программу, которая выводит все имена, начинающиеся на определенную букву.
//List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank");
//char targetLetter = 'C';

    public static List<String> getPrefName(List<String> names, char targetLetter){ // харош
        List<String> name = new ArrayList<>();
        for (String srt : names){
            if(srt.startsWith(Character.toString(targetLetter))){
                name.add(srt);
            }
        }
        return name;
    }
    // endregion
//region 4.У вас есть список List<String>, содержащий слова.Напишите программу, которая находит все пары слов, в которых первое слово является обратным написанию второго слова.
//List<String> words = Arrays.asList("lemon", "cat", "tac", "dog", "god", "man", "nam");
    public static List<String> findWordPairs(List<String> words){
        List<String> pairs = new ArrayList<>();
        for (int i = 0; i < words.size()-1; i++) { // -
            String str = words.get(i);
            for (int j = i+1; j < words.size(); j++) { // -
                String str1 = words.get(j);
                if(isReverse(str,str1)){
                    String pair = str + " -> " + str1;
                    pairs.add(pair);
                }
            }
        }
        return pairs;
    }

    public static boolean isReverse(String str, String str1){
        StringBuilder stringBuilder = new StringBuilder(str1).reverse();
        return str.contentEquals(stringBuilder);
    }
    // endregion
}

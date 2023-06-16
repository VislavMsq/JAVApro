import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex5 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(i);
        }
        getCombination(List.of(  // метод создает лист фикс. и передаем префикс , т.е элемент
                "qwer",
                "asdf",
                "zxc"
        ), set);
    }

    public static void getCombination(List<String> list, Set<Integer> set) {
        for (int i = 0; i < list.size(); i++) {
            for (Integer num : set) {                   // num - элемент сета
                // прибаляем стринговое значение к перенной num
                // если в выводе есть стринга, то все кастится к строке
                System.out.println(list.get(i) + num);
            }
        }
    }
}
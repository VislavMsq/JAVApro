package List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise {
    public static void main(String[] args) {
        System.out.println(findDup(List.of(     // List.of - фикс лист, лист не изменяемый
                "abc",
                "acd",
                "abc"
        )));
    }

    //Найти все дубликаты в List<String> и вернуть их в виде нового списка.
    /*
        1. Создаем сэт
        2. Создаем лист
        3. Проходиммя циклом и заполняем им сэт
        4. Если метод возвращает false, то помещаем в лист
     */
    public static List<String> findDup(List<String> list) {
        Set<String> set = new HashSet<>();      // уникальные значения
        List<String> result = new ArrayList<>();// структура, куда записываем результат

        for (int i = 0; i < list.size(); i++) { // set выдает boolean
            if (!set.add(list.get(i))) {        // дает false, значит элем встречается -> кладем его в список
                result.add(list.get(i));
            }
        }
        return result;
    }
}


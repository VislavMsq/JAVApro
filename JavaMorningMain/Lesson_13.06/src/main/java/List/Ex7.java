package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ex7 {
    /*
     * 1. Найти все ключи в Map<String, Integer>, соответствующие заданному значению, и вернуть их в виде списка.
     */

    /*
       1. создаем list
       2. создаем сет ключей значений
     */
    public static void main(String[] args) {

    }

    public static List<Integer> getKeys(Map<String, Integer> map, Integer num) {
        List<String> keys = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {    // Entry - сет ключей/значений, entrySet - перебираем мапу
            if (entry.getValue().equals(num)){      //
                keys.add(entry.getKey());           //
            }
        }
        return null;
    }
}
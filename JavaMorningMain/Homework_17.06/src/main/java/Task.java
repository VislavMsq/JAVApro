import java.security.Key;
import java.util.*;

public class Task {
    public static void main(String[] args) {
        // 1.
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "123qqq");
        map.put(2, "q2eqwert");
        map.put(3, "2cvw");
        map.put(4, "228");
        getKeys(map);

        // 2.
        System.out.println(isContainsValue(map, "One"));

        // 3.
        System.out.println(findKeyWithValue(map, "One"));

        // 4.
        System.out.println(isContainsKey(map, 5));

        //5.
        System.out.println(isKeyWithBiggest(map));

        //6.
        System.out.println("Count of keys -> " + getCountOfAnySubValue(map, "cd"));

        // 7.
        System.out.println(valueIsNumeric(map));

        // 8.
        System.out.println(sumOfIntegerValue(map));

        // 9.
        System.out.println(getCountOfBorderLengthValue(map, 3));

        // 10.
        System.out.println(mapReverse(map));
    }


    //region Вывести все ключи из мапы на экран
    public static void getKeys(Map<Integer, String> map) {

//        for(Integer key : map.keySet()){
//            System.out.println(key);
//        }
        System.out.println("Keys ->" + map.keySet());
    }

    // endregion
    //region Проверить, содержит ли мапа определенное значение.
    public static boolean isContainsValue(Map<Integer, String> map, String value) {
        return map.containsValue(value.toLowerCase());
    }

    // endregion
    //region Найти ключ, связанный с определенным значением.
    public static Integer findKeyWithValue(Map<Integer, String> map, String value) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) { // [[K,V], [K,V]...] entrySet - вывод ключ\значене
            if (entry.getValue().equalsIgnoreCase(value)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // endregion
    //region Проверить, содержит ли мапа определенный ключ.
    public static boolean isContainsKey(Map<Integer, String> map, Integer key) {
        return map.containsKey(key);
    }

    // endregion
    // region Найти ключ с максимальным значением.
    public static Integer isKeyWithBiggest(Map<Integer, String> map) {
        Integer key = null;
        String value = "";

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > value.length()) {
                key = entry.getKey();
                value = entry.getValue();
            }
        }
        return key;
    }

    // endregion
    // region Подсчитать количество ключей, значение которых содержит определенное слово.

    public static Integer getCountOfAnySubValue(Map<Integer, String> map, String subValue) {
        int j = 0;

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().contains(subValue)) {       // берем значение и проверяем есть ли подсрока в нем
                j++;
            }
        }
        return j;
    }
    // endregion
    // region Найти все ключи, значение которых состоит только из цифр.
    // меашаесашаедаша - [м ,аша ,саша .даша] - split

    /**
     * если доходим до ближ. буквы, мы знает, что ее нет в list, !говорит, что она есть и мы возвращаем true
     * спускаем в return
     * тем самым говорим, что это не числовое значение
     */
    public static boolean isNumeric(String s) { // s = 12a
        List<String> list = Arrays.asList("0123456789.".split(""));
        for (String chr : s.split("")) {      // split - возвращает список с раздельными элементами по заполнителю
            if (!list.contains(chr)) {              // !true -> false
                return false;
            }
        }
        return true;
    }

    public static List<Integer> valueIsNumeric(Map<Integer, String> map) {
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (isNumeric(entry.getValue())) {  // если метод говорит, что у нас есть число, то мы длобавляем его в List
                list.add(entry.getKey());
            }
        }
        return list;
    }

    // endregion
    // region Подсчитать сумму числовых значений в мапе.
    public static Float sumOfIntegerValue(Map<Integer, String> map) {
        float sum = 0;
        for (String s : map.values()) {
            if (isNumeric(s)) {               // используем метод из прошлой задачи
                sum += Float.parseFloat(s);  //
            }
        }
        return sum;
    }

    // endregion
    // region Подсчитать количество ключей, у которых длина значения превышает определенную границу.
    public static Integer getCountOfBorderLengthValue(Map<Integer, String> map, Integer borderLength) {
        int count = 0;
        for (String str : map.values()) {
            if (str.length() > borderLength) {
                count++;
            }
        }
        return count;
    }

    // endregion
    // region Создать новую мапу, где значениями будут ключи, а ключами - значения исходной мапы.
    // [[K,V] [K,V]] -> [[V,K][V,K]]
    public static Map<String, Integer> mapReverse(Map<Integer, String> map) {
        Map<String,Integer> mapR = new HashMap<>();
        for (Map.Entry<Integer,String> entry : map.entrySet()){
            mapR.put(entry.getValue(),entry.getKey());
        }
        return mapR;
    }
    // endregion
    // region Очистить мапу и вывести сообщение о ее пустом состоянии.
}


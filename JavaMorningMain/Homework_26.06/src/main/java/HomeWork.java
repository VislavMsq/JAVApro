import java.util.*;

public class HomeWork {

    public static void main(String[] args) {

        // region Solutions
        //1.
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

        // 11.
//        System.out.println(map);
//        clearAndPrint(map);
//        System.out.println(map);

        // 12.1
        List<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(321);
        list.add(111);

        // 12.2
        printEveryElement(List.of(list.toArray()));

        // 13.
        reverseOut(List.of(list.toArray()));

        // 14.
        int[] arr = {3, 5, 9, 2, 4, 12};
        getMinAndMax(arr);

        // 15.
        System.out.println("Enum count -> " + countOfEnum(arr));

        // 16.
        reversSort(arr);

        // 17.
        System.out.println("Square sum -> " + squareSum(arr));
        // endregion
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
        Map<String, Integer> mapR = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            mapR.put(entry.getValue(), entry.getKey());
        }
        return mapR;
    }

    // endregion
    // region Очистить мапу и вывести сообщение о ее пустом состоянии.
    public static void clearAndPrint(Map<Integer, String> map) {
        map.clear();        // очистили Map
        System.out.println("Map was cleared");
    }

    // endregion
    // region Создать список List, заполнить его несколькими значениями и вывести на экран каждый элемент списка.
    public static void printEveryElement(List<Object> list) {
        for (Object elem : list) {
            System.out.print(elem + " \n");
        }
    }

    // endregion
    // region Создать список List, заполнить его несколькими значениями. Затем перебрать список и вывести
    // элементы в обратном порядке.
    public static void reverseOut(List<Object> list) {
        System.out.println("reverse out");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    // endregion
    // region Вычислить сумму всех элементов в массиве int[] и вывести результат.
    public static int getArraySum(int[] arr) {
        int sum = 0;
        for (Integer num : arr) {
            sum += num;
        }
        return sum;
    }

    // endregion
    // region Найти наименьший и наибольший элементы в массиве int[] и вывести их.
    public static void getMinAndMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : arr) {
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }
        System.out.println("Max -> " + max);
        System.out.println("Min -> " + min);
    }

    // endregion
    // region Подсчитать количество четных элементов в массиве int[] и вывести результат.
    public static int countOfEnum(int[] arr) {
        int count = 0;
        for (Integer num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // endregion
    // region Отсортировать массив int[] в порядке убывания и вывести отсортированный массив.
    public static void reversSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // endregion
    // region Подсчитать сумму квадратов всех элементов в массиве int[] и вывести результат.
    public static int squareSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] * arr[i];
        }
        return sum;
    }
    // endregion
}



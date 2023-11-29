public class Task1 {
    public static void main(String[] args) {
        String str = "abba";
        String str2 = "abama";

        System.out.println(isPalindrome(str2));
    }

//    `equals`  → смотрит на значение и сравнивает по значению
//
//    `hashCode`→ смотрит код объекта и сравнивает код
//
//     `==`     → смотрит на ссылки
//
//`instance of` → смотрит тип объекта


    // очень здорово, если обьяснять программу по шагам
    // каждый кусочек алгоритма нужно обсуждать и комментировать
    public static boolean isPalindrome(String str) {
        int left = 0;                // str = "abba"
        int right = str.length() - 1; // индекс указывает на посдний элемент
//        boolean isPalindrom = false;
        if (str.equals("")) {   // у нас String с Большой буквы, мы сравниваем обьекты по значению
//            return isPalindrom;
            return false;
        } else {
            while (left <= right) {       // пока символы не сошлись в опререленной строчке,знак < нам нужен, что left не перешел за середину
                if (str.charAt(left) != str.charAt(right)) { // charAt - берет символ из массива и апперирует им
                    return false;
                    // чар примитив, мы сравнимаем его по значениям
//                    isPalindrom = true;  // если элементы равны, то выдаем true
                }
                left++;
                right--;
//                } else {
//                     return false;  // если не палиндром, то выходим из цикла
//                }
            }
        }
//        return isPalindrom;
        return true;
    }
    /*  1.лучший случай, если строка будет пустая
        2.в худшем случае, если строка почти палиндром, но в середине символы не совпадают
        3.работа алгоритма зависит от кл-ва символов
        4.алгоримт линейно растет, по отношению к длинне строки
        5.o(n) - линейная сложность алгоритма
        6. все линейные алгоритмы имеют сложность o(n)
     */
}

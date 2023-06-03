public class Practice {
    public static void main(String[] args) {
// создать класс коробка, в котором можно хранитьзначение значение
// разных типов в разных коробках
        Box<String> box1 = new Box<>();
        box1.setT("box1");
        String s = (String) box1.getT();

        Box<Integer> b2 = new Box<>();
        b2.setT(2);
        int x = (Integer) b2.getT();

        System.out.println(s + " " + x);

        Pair<String, Integer> result = findMostFrequentWord(new String[]{"1", "2"});
        String word = result.getE1();
        System.out.println(result.getE1() + " " + result.getE2());

        Pair<Customer,Long> result2 = findMostFrequentCustomer(new Customer[0]);


    }

    // метод находит самое часто встречающиеся слово
    // в тексте и возвращает его и кл-во его вхождений
    public static Pair<String,Integer> findMostFrequentWord(String[] text) {
        int count = 0;
        String word = "!" ;
        // как-то работает!
        // а как вернуть
        // return count and word
        int maxCount = 10;
        String maxWord = "!!!" ;
        return new Pair<String,Integer>(maxWord, maxCount);
    }
    // метод находит самого часто встречающиегося посетителя
    // и возвращает его и кл-во его вхождений
    public static Pair<Customer, Long> findMostFrequentCustomer(Customer[]customers){
        return new Pair<>(new Customer(), (long)100);
    }
}

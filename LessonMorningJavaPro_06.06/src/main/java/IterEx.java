import java.util.*;

public class IterEx {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Evegeny");
        list.add("Lera");
        list.add("Vladislav");
        list.add("Vadim");
        list.add("Vitaly");
        list.add("Oksana");

        // Evegeny Lera Vladislav Vadim Vitaly Oksana
        Iterator<String> iterator = list.iterator();    // лучше использоваться там где нет индексов
//        while(iterator.hasNext()){      // has.next - если есть возвращает тру и идет дальше
//            iterator.next();            // next - возвращает конкретный элемент
//            iterator.remove();          // remove - может удалить
//
//        }
//        System.out.println(list + "!!!!");

        ListIterator<String> direct = list.listIterator();
        while ((direct.hasNext())) {
            System.out.println(direct.previous());
        }
        ListIterator<String> reverse = list.listIterator(list.size());  // урсор на всю длинну строки
        while(reverse.hasPrevious()){
            System.out.println(reverse.previous());
        }


    }
}

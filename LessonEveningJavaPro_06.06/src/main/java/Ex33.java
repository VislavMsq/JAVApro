import java.util.*;

public class Ex33 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("RR");
        list.add("QQ");
        list.add("II");
        list.add("YY");
        list.add("LL");

//        System.out.println(list);

        // движется от начала в конец
        Iterator<String> iterator = list.iterator();
        ListIterator<String> listIterator = list.listIterator(list.size() / 2);
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }


        // RR QQ II YY LL
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
//            System.out.print(iterator.next() + " ");
        }
        System.out.println(list);
    }
}

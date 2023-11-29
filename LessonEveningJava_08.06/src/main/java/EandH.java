import lombok.AllArgsConstructor;

import java.util.*;

public class EandH {
    public static void main(String[] args) {


        T1000 t1000; // имплементиться от Camparable

        List<T1000> t1000List = new ArrayList<>();        // индексы, хранит порядок добавления
        List<T1000> t1000List1 = new LinkedList<>();      // индексы, хранит порядок добавления

        Set<T1000> t1000Set = new HashSet<>();
        Set<T1000> t1000Set1 = new TreeSet<>();
        Set<T1000> t1000Set2 = new LinkedHashSet<>();

//        T1000 t10001 = new T1000();
//        T1000 t10002 = new T1000();

//        System.out.println(t10001 == t10002);

        String s = "!";
        String d = "!";
        String u = new String("!");

        System.out.println(s == d);
        System.out.println(s == u);

        System.out.println(s.equals(d));
        System.out.println(s.equals(u));

        T1000 T1 = new T1000("T","T1000", 100,838.2F);
        T1000 T2 = new T1000("T","T1000", 100,838.2F);

        System.out.println(T1.hashCode());
        System.out.println(T2.hashCode());

        System.out.println(T1.equals(T2));

    }
}
@AllArgsConstructor
class T1000{
    String name;
    String model;
    Integer power;
    Float voltage;




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        T1000 t1000 = (T1000) o;
        return power == t1000.power
                && Float.compare(t1000.voltage, voltage) == 0
                && Objects.equals(name, t1000.name)
                && Objects.equals(model, t1000.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, power, voltage);
    }
}
package param;

import java.util.ArrayList;
import java.util.List;

public class PMex1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Q");
        list.add("QW");
        list.add("QE");

//        String s0 = param.CL.getEl(list);
//        System.out.println(s0);
    }

}

class CL<T> {
    public T getEl(List<T> list) {
        return list.get(0);
    }

    // ? extends X
    // ? super X - выше чем Х
    // ? - ваил кард
}

class T {

}

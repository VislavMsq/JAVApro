package param;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class PCEx2 {
    public static void main(String[] args) {
        P<Integer,String> stringP = new P<>(1,"<Q>");
        P<Integer,String> stringP1 = new P<>(2,"W");
        P<Integer,String> stringP2 = new P<>(3,"E");

        System.out.println(stringP2);


    }
}
@AllArgsConstructor
@Getter
@Setter
@ToString
class P<T1, T2> {
    private T1 t1;
    private T2 t2;
}
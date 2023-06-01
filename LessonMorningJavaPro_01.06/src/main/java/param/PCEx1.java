package param;

import lombok.Getter;
import lombok.ToString;

public class PCEx1 {
    public static void main(String[] args) {
        I<String> stringI = new I<>("Java");
        I<Integer> integerI = new I<>(888);
        I<Object> objectI = new I<>(new Object());




    }
}
@ToString
@Getter
class I<T> {        // T = 5, T = 11
    private T value;

    public I(T value) {
        this.value = value;
    }
}

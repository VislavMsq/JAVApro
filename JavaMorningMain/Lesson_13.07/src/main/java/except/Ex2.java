package except;

public class Ex2 {
    /**
     *
     * @param a first digit
     * @param b second digit
     * @return divide of 'a' and 'b'
     * @throws ArithmeticException if b == 0;
     */
    public int dev(int a, int b) {
        if(b == 0){
            throw  new ArithmeticException();   // обработка exception
        }
        return a / b;
    }
}

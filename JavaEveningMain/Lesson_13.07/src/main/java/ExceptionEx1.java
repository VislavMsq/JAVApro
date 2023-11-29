public class ExceptionEx1 {
    public int divide(int a, int b)throws IncorrectDivideExcep {
//        if (b == 0) {
//            throw new ArithmeticException(ExceptionMessage.DIVIDE_EXCEPTION);
//        }
        return a / b;
    }
}

class Main{
    public static void main(String[] args) {
        ExceptionEx1 exceptionEx1 = new ExceptionEx1();
        exceptionEx1.divide(20, 5);
    }
}

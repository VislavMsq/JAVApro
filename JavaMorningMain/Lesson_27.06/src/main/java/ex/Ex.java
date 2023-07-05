package ex;

public class Ex {
    public static void main(String[] args) {

        printTest(item -> {     // реализация  метода
            int sum = 0;
            for (Integer elem : item) {
                sum += elem;
            }
            System.out.println(sum);
        });

        printTest(Ex::sumArr);  // ссылается на метод

    }

    public static void sumArr(int[] arr) {
        int sum = 0;
        for (Integer elem : arr) {
            sum += elem;
        }
        System.out.println(sum);
    }

    public static void printTest(Test test) {
        test.print(new int[]{1, 2, 3, 4});     // инициализация массива
    }
}

@FunctionalInterface
interface Test {
    void print(int[] arr);

}
package ex;

public class Ex2Lesson {
    public static void main(String[] args) {
        createArr(Ex2Lesson::getSum);
    }

    public static void getSum(int[]arr){
        int sum = 0;
        for (Integer elem : arr){
            sum += elem;
        }
        System.out.println(sum);
    }
    public static void createArr(Ka ka) {
        int[] arr = {1, 2, 3, 4, 5};
        ka.get(arr);

    }
}


interface Ka {
    void get(int[] arr);
}
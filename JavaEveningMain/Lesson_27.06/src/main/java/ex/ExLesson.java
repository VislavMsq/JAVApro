package ex;

public class ExLesson {
    public static void main(String[] args) {
        getSum(arr -> {
            int sum = 0;
            for (Integer elem : arr){
                sum += elem;
            }
            System.out.println(sum);
        });
    }

    public static void getSum(Te te) {
        te.get(new int[]{1, 2, 3, 4, 5});
    }
}

interface Te {
    void get(int[] arr);
}
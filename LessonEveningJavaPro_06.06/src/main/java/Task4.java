public class Task4 {


    // разобраться с этим методом дома
    private static int getUnique(int[] array) {
        int xor = 0;
        for (int x : array) {
            xor ^= x;       // исключаешее или ^ (побитовая операция)
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3};
        System.out.println(getUnique(arr));

    }
}

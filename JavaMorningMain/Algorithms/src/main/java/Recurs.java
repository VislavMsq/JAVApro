public class Recurs {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // 1.
        System.out.println(recurs(2, 2));
        // 2.
        System.out.println(getSumRecurs(arr, arr.length - 1));
        // 3.
        System.out.println(getPower(2, 3));
        // 4.
    }

    // 1. дойти из точки А до точки Б. Посчитать кл-во шагов.
    public static int recurs(int n, int m) {
        if (n < 1 || m < 1) {
            return 0;
        }
        if (n == 1 || m == 1) {
            return 1;
        }
        return recurs(m - 1, n) + recurs(n - 1, m);
    }

    // 2. посчитать сумму элементов в массиве
    public static int getSum(int[] arr, int index) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // 2.1
    public static int getSumRecurs(int[] arr, int index) {
        if (index < 0) {
            return 0;
        }
        return arr[index] + getSumRecurs(arr, index - 1);
    }

    // 3. Возведение в степень
    public static int getPower(int a, int pow) {
        int result = 1;
        for (int i = 0; i < pow; i++) {
            result *= a;
        }
        return result;
    }

    public static int getPowerRec(int a, int pow) {
        if (pow < 0) {
            return 0;
        }
        return getPowerRec(a, pow - 1) * a;
    }

    // 4. Найти найбольший общий делитель для общих чисел
    public static int largestDivisor(int num, int num2) {

    }
}
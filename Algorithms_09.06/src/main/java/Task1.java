public class Task1 {
    public static void main(String[] args) {
        int result = methodA(5);
        System.out.println("Result: " + result);
    }

    private static int methodA(int n) {
        int x = n + 1;
        int y = methodB(x);
        return y;
    }

    private static int methodB(int x) {
        int q = x * 2;
        return q;
    }
}

public class Task2 {

    public static void main(String[] args) {
        System.out.println(summation(1));
        System.out.println(summation(8));

        System.out.println(removeExclamationMarks("Hallo World"));
        System.out.println(removeExclamationMarks("Hallo World!"));
    }

    public static int summation(int num) {

        int sum = 0;

        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public static String removeExclamationMarks(String s) {
        return s.replaceAll("!", "");
    }
    public static boolean check(Object[] a, Object x) {
        if ()
        return false;
    }
}

public class Hanoi {
    public static void main(String[] args) {
        move(1, 1, 2, 3);
    }

    private static void move(int n, int source, int destination, int helper) {
        if (n == 0) {       // проверку на кл-во дисков
            return;         // n - это кл-во дисков
        }
        move(n - 1, source, helper, destination);
        System.out.println(source + "->" + destination);
        move(n - 1, helper, destination, source);
    }
}

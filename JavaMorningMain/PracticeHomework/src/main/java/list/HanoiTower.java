package list;

public class HanoiTower {
    public static void main(String[] args) {

    }

    public static void move(int n, char source, char destination, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        move(n - 1, source, auxiliary, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        move(n - 1, auxiliary, destination, source);
    }
}

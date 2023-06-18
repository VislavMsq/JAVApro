import java.util.Stack;

public class HanoiTowerOld {
    public static void hanoiTowerMy(int n, char fromRod, char toRod, char auxRod) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();

        int totalMoves = (int) (Math.pow(2, n) - 1);

        // Заполняем первый стержень дисками
        for (int i = n; i >= 1; i--) {
            stack1.push(i);
        }

        // Проверяем четность/нечетность количества дисков
        if (n % 2 == 0) {
            char temp = toRod;
            toRod = auxRod;
            auxRod = temp;
        }

        // Выполняем перемещение дисков
        for (int move = 1; move <= totalMoves; move++) {
            if (move % 3 == 1) {
                moveDisk(stack1, stack2, fromRod, toRod);
            } else if (move % 3 == 2) {
                moveDisk(stack1, stack3, fromRod, auxRod);
            } else if (move % 3 == 0) {
                moveDisk(stack2, stack3, toRod, auxRod);
            }
        }
    }

    private static void moveDisk(Stack<Integer> source, Stack<Integer> destination, char sourceRod, char destinationRod) {
        int disk = source.pop();
        destination.push(disk);
        System.out.println("Move disk " + disk + " from " + sourceRod + " to " + destinationRod);
    }

    public static void main(String[] args) {
        int n = 3;
        char fromRod = 'A';
        char toRod = 'C';
        char auxRod = 'B';

        hanoiTowerMy(n, fromRod, toRod, auxRod);
    }
}

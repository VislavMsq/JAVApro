import java.util.Random;

public class Task {
    public static void main(String[] args) {
// Задача 7 (Уровень сложности: 3):
// Напишите программу, которая определяет, содержит ли заданный массив заданное значение.

        System.out.println(getNum(33));

    }
    public static boolean getNum(int num){
        Random random = new Random();
        int [] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }
}

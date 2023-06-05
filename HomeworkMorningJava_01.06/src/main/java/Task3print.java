public class Task3print {
    public static void main(String[] args) {
/*
Напишите параметризированный метод "printArray", который принимает
массив элементов и выводит их на консоль. Метод должен работать с любыми типами данных.
 */
        String[] numbersString = {"One", "Two", "Theree"};
        Integer[] numbers = {1, 2, 3, 4, 5};

        printArray(numbers);
        printArray(numbersString);
    }

    public static <Q> void printArray(Q[] array) {
        for (Q print : array) {
            System.out.print(print + " ");
        }
    }
}


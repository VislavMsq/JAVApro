public class Task1Swap {
    public static void main(String[] args) {
/*
Реализуйте параметризированный метод "swap", который принимает массив элементов
и два индекса внутри массива. Метод должен поменять местами элементы по указанным индексам.
 */
        Integer[] array = {1, 2, 3};
        String[] str = {"One", "Two", "Three"};

        System.out.println("Before array:");
        for(Integer num : array){
            System.out.print(num + " ");
        }

        swap(array,1,2);

        System.out.println("After array:");
        for (Integer num2: array) {
            System.out.print(num2 + " ");
        }

        System.out.println("Before array:");
        for(String string : str){
            System.out.print(string + " ");
        }

        swap(str,0,2);

        System.out.println("After array:");
        for(String string2 : str){
            System.out.print(string2 + " ");
        }

    }

    public static <Q> void swap(Q[] arr, int index1, int index2) {
        Q temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

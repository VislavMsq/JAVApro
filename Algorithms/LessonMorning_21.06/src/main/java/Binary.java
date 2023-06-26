public class Binary {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 10};
        System.out.println(binarySearch(array, 3, 0, array.length - 1));
    }

    // находим индекс искомого элемента(итеративно)
    private static int binarySearch(int[] array, int key, int low, int high) {
        int index = -1; // хороший пример, отрицательных индексов в массиве не сущуствует

        while (low <= high) {       // курсор идет с двух сторон, пока одна половина ровна или нижняя меньше, выходим
            int mid = (low + high) / 2; // mid - индекс среднего элемента
            if(array[mid] < key){
                low = mid + 1;  // сдвигаем нижнюю границу
            } else if (array[mid] > key) {
                high = mid -1;  // сдвигаем верхнюю границу
            } else {
                index = mid;
                break;
            }
        }
        return index;
    }
}

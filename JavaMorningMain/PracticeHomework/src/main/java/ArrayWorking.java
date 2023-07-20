public class ArrayWorking {
    private int[] array =  new int[5];      //  Массив, в который пишем данные
    private int count = 0;                  // Счетчик массива - указывает на свободную ячейку памяти, также указывает на количество элементов(преимущества счета с нуля)

    /**
     * Метод для вставки элемента в массив
     * @param data вставляемый элемент
     */
    public void add(int data){
        System.out.println("Add " + count + " " + data);
        if(count == array.length){            // Проверяем не закончилась ли память
            int[] temp = array;               // Копируем массив во временный массив
            array = new int[2*array.length];  // Выделяем в два раза больше памяти
            copy(temp);                       // Вызываем метод для копирования старого массива
        }
        array[count] = data;              // Обращаемся по счетчику к свободному элементу массива и вставляем в него элемент
        count++;                          // Увеличиваем счетчик
    }

    /**
     * Метод для возврата элемента по индексу
     * @param index индекс
     * @return элемент
     */
    public int get(int index){
        return array[index];
    }

    /**
     * Метод для копирования элементов массива
     * @param temp старый массив
     */
    private void copy(int[] temp) {
        for (int i = 0; i < temp.length; i++) {  // Поэлементно копируем массив
            array[i] = temp[i];
        }
    }
    /**
     * Метод для удаления элемента
     */
    public void deleteElement(){
        count--;
    }

    /**
     * Метод для удаления массива
     */
    public void deleteArray(){
        count = 0;
    }

    /**
     * Метод, который симулирует взлом нашей программы
     */
    public void hack(){
        count = array.length;
    }

    /**
     * Метод для стирания данных
     */

    public void erase(){
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        count = 0;
    }

    /**
     * Метод для вывода всей выделенной памяти под массив
     */
    public void display(){
        System.out.println("Выделенная память: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /**
     * Метод для вывода массива
     */
    public void displayInitialized(){
        System.out.println("Массив: ");
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

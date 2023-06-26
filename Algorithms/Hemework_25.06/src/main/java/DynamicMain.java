public class DynamicMain {
    /*
    Создайте структуру DynamicArray
    Реализуйте два пути создания:
    DynamicArray() - по умолчанию size = 10
    DynamicArray(capacity) - size = capacity

    Реализуйте методы:
    add(data) - добавляет в конец
    remove() - удаляет последний
    removeAt(index) - удаляет по индексу
    growSize() - увеличивает размер
    set(index, data) - изменяет элемент
    clean() - удаляет все элементы
    contains(data) - проверяет существует ли элемент
    isEmpty() - вернет false, если в структуре есть элемент
     */
    public static void main(String[] args) {
        DynamicList<Integer> list = new DynamicList<>();

//        System.out.println(list.getClass());

        list.add(2);

        list.out();

//        System.out.println(list[0]);



//        DynamicList<String> list2 = new DynamicList<>();

    }
}

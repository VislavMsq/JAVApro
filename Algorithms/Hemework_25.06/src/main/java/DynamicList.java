import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class DynamicList<T> {
    private Integer size;
    private T[] list;

    private int freeCapacity = 0;

    public DynamicList() {
        this.size = 10;
        this.list = (T[]) Array.newInstance(Object.class, 10);

        System.out.println(this.list);


//        for (T t: this.list) {
//            System.out.println(t.getClass());
//        }


//        this.list = (T[]) new Object[10];

//        System.out.println(Arrays.toString(this.list));
//        System.out.println(this.list.getClass());


//        List

        // add
        // if freeCapacity >>> this.size * 2;
        // int[this.size] > Integer[this.size * 2]
        // >>> size = 10
        // freeCapacity-- >>> 9


    }

    public DynamicList(Integer size) {
        this.size = size;
        this.list = (T[]) Array.newInstance(Object.class, size);
    }


    // list = new DynamicList()   --1

    // list = new DynamicList(20) --2

    // list. == this.

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

// region add(data) - добавляет в конец

    // DynamicList<Integer> list = new DynamicList<>();
    // list.size >>> 10

    // [1, 2, 3, null, null, ...]

    // for >>> list[index] == null
    //  list[index] = data

    public void add(T data) {

        this.list[this.freeCapacity] = data;
        freeCapacity++;
        if (this.freeCapacity == this.size-1) {                                        // проверка на заполнение
            T[] newList = (T[]) Array.newInstance(Object.class, this.size*2);    // создаем новый массив с развером вдвое больше
            for (int i = 0; i < list.length; i++) {
                newList[i] = this.list[i];                      // создали новый массив и переметили в него старый
            }
        }


//        for (int i = 0; i < this.size; i++) {
//            if (this.list[i] == null) {     // проверка если индекс листа = null
//                this.list[i] = data;        // то записываем в массив данные
//                this.freeCapacity--;        // свободное место уменьшилось
//                return;
    }


    public void out(){
        System.out.print("[");
        for (T t: this.list){
            System.out.print(t);
            System.out.print(", ");
        }
        System.out.print("]");
        System.out.println();
    }

}

// endregion

// [1, 2, 3, 4, 5, null, null]

// 2
// [1, 2, 4, 5, 5, null, null]
// [1, 2, 4, 5, null, null, null]



public class HashTable {
    Object[] arr = new Object[23];

    /**
     * Метод в котором определяется ключ элементов(позиция в массиве) и добавляется в эту позицию элемент
     * @param key   - ключ
     * @param value - элемент
     */
    public void add(Object key, Object value) {
        int pos = hash(key);        // находим позицию
        int step = hash2(key);      // находим смещение

        while (arr[pos] != null){
            System.out.println("Коллизия");
            System.out.println("pos = " + pos + " уже занята");
            pos += step;        // прибаляем сещение к позиции вставки
            System.out.println("step = " + step + " сдвиг");
            pos %= arr.length;  // находим остаток от деления
            System.out.println("pos = " + pos + " новая позиция");
        }
        arr[pos] = value;
    }

    /**
     * Метод,который по ключу вычесляет позицию элемента по в массиве и возвращает элемент
     * @param key - ключ
     * @return элемент
     */
    public Object getValue(Object key) {
        return arr[hash(key)];
    }

    /**
     * Метод для хиширования ключей - определение позиии в массиве для элемента
     *
     * @param key - ключ
     * @return элемент
     */
    public int hash(Object key) {
        return key.hashCode() % arr.length;  // берем остаток от деления hash значени на размер массива
    }

    public int hash2(Object key){       // берем
        return 5 - key.hashCode() % 5;
    }

    public void display() {
        System.out.println("Масив");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

public class HashMap<K, V> {       // К - обобщение для ключа, V - обобщение для значения
    private V[] arr = (V[]) new Object[10];     // массив значений - способ приведения

    public int hash(K key) {
        return key.hashCode() % arr.length;
    }

    public void insert(K key, V value) {
        int pos = hash(key);        // получаем индекс для вставки в массив
        arr[pos] = value;
    }

    public V find(K key){
        int pos = hash(key);
        return arr[pos];
    }

    public void display(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

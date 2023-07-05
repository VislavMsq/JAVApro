public class Main {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.hashCode());
        HashTable hashTable = new HashTable();
        hashTable.add("Hello","Привет");
        System.out.println(hashTable.getValue("Hello"));
        hashTable.display();
        hashTable.add("Bye", "Пока");
        hashTable.add("Cat", "Кот");
        hashTable.add("Dog", "Собака");
        hashTable.add("Plane", "Самолет");
        hashTable.add("Ship", "Корабль");
        hashTable.add("Auto", "Авто");
        hashTable.add("Coffee", "Кофе");
        hashTable.add("tea", "Чай");
        hashTable.add("Candy", "Конфета");

        hashTable.display();
    }
}

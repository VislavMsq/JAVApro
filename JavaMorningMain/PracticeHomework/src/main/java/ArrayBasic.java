public class ArrayBasic {
    public static void main(String[] args) {
        ArrayWorking arrayWorking = new ArrayWorking();
        arrayWorking.add(1);
        arrayWorking.display();
        arrayWorking.displayInitialized();
        arrayWorking.add(1);
        arrayWorking.display();
        arrayWorking.displayInitialized();
        arrayWorking.add(1);
        arrayWorking.display();
        arrayWorking.add(1);
        arrayWorking.displayInitialized();
        arrayWorking.display();
        arrayWorking.add(1);
        arrayWorking.displayInitialized();
        arrayWorking.display();
        arrayWorking.add(1);
        arrayWorking.display();
        arrayWorking.displayInitialized();
        System.out.println("Удаление элемента из массива: ");
//        arrayWorking.deleteElement();
        arrayWorking.display();
        arrayWorking.displayInitialized();
        System.out.println("Удаление массива: ");
        arrayWorking.deleteArray();
        arrayWorking.display();
        arrayWorking.displayInitialized();
        System.out.println("Взломали массив: ");
        arrayWorking.hack();
        arrayWorking.display();
        arrayWorking.displayInitialized();
        arrayWorking.erase();
        System.out.println("Взломали массив: ");
        arrayWorking.hack();
        arrayWorking.display();
        arrayWorking.displayInitialized();


    }
}

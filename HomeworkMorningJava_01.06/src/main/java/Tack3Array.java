public class Tack3Array {
    /*
    Создайте параметризированный класс "LinkedList", представляющий связный список элементов.
    Реализуйте методы "add", "remove" и "contains" для добавления элемента в список, удаления элемента из
    списка и проверки, содержится ли элемент в списке соответственно.
     */
    public static void main(String[] args) {

    }
}

class Stack<Q> {
    private Q[] arr;
    private int cursor = 0;

    private void push(Q element) {
        if (cursor == arr.length) {
            System.out.println("Стек переполнен!");
            return;
        }
    }
}

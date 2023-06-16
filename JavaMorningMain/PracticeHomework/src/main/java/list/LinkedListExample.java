package list;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // создание LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        // метод add - добовляет элемент
        linkedList.add(5);
        linkedList.add(15);
        linkedList.add(25);
        // метод get(1) - выводит элемент по индексу
        int num = linkedList.get(1);
        System.out.println("Number: " + num); // печатает 15
        // иттерация по LinkedList
        for (Integer number : linkedList) {
            System.out.println("Number: " + number); // печатает полный массив
        }
        // метод remove - удаления элемента по индексу
        linkedList.remove(1);
        // конструкция (Integer.valueOf(5) - удаляет элемент по его значению
        linkedList.remove(Integer.valueOf(5));
        // метод contains - проверяет на наличие элемента в LinkedList
        boolean contains = linkedList.contains(25);
        System.out.println("Contains" + contains); // печатает true
    }
}

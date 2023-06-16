package task;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
/*
 * ++Класс task.Person  name (имя) и age (возраст)
 *
 * 1. Создать и заполнить две мапы.
 * Затем перебрать обе мапы и вывести на экран
 * информацию о каждом человеке (из Map<String, task.Person>)
 * в формате: "Имя: <name>, Возраст: <age>".
 * Для каждого элемента Map<String, String> добавить
 * к значению строку "is a person".
 *
 *
 * * 2. Создать и заполнить две мапы.
 * Затем перебрать обе мапы и вывести на экран
 * только имена людей (из Map<String, Person>).
 *
 * * 3. Создать и заполнить две мапы.
 * Затем перебрать обе мапы и вывести на экран
 * средний возраст всех людей (из Map<String, Person>).
 *
 * * 4. Создать и заполнить две мапы.
 * Затем перебрать обе мапы и создать новый мап
 * (Map<String, String>), где ключом будет имя человека,
 * а значением будет его возраст в виде строки.
 */

        Map<String, Person> map = new HashMap<>();
        Map<String, String> ageMap = new HashMap<>();

        int countPers = 0;
        int sumAge = 0;

        map.put("p1",new Person("Bill",20));
        map.put("p2",new Person("Kate",25));
        map.put("p3",new Person("John",21));

        Map<String, Person> map1 = new HashMap<>();
        map.put("p4",new Person("Connor",34));
        map.put("p5",new Person("Megan",31));
        map.put("p6",new Person("Lili",13));

        // вывели на экран
        for (Map.Entry<String, Person> entry : map.entrySet()){
            System.out.println(entry.getValue()); // getValue - берет значения из Map
            String name = entry.getValue().getName();
            System.out.println("Name: " + name);

            Person person = entry.getValue();
            sumAge += person.getAge();
            countPers++;

            // Ключем является имя из Person, а значение age
            ageMap.put(String.valueOf(entry.getValue().getName()), String.valueOf(entry.getValue().getAge()));
        }



        //   для перебора ключ/значение
        for (Map.Entry<String, Person> entry : map.entrySet()){     // способ перебора
            System.out.println("is a person: " + entry);
            Person person = entry.getValue();
            sumAge += person.getAge();
            countPers++;

            // Ключем является имя из Person, а значение age
            // достаем значение из старой мапы и кладем их в новую, getAge - достаем только возраст
            ageMap.put(String.valueOf(entry.getValue().getName()), String.valueOf(entry.getValue().getAge()));

        }
        System.out.println("Age map: " + ageMap);
        System.out.println("Average age: " + sumAge / countPers);

//        for (Map.Entry<String, String> entry : ageMap.entrySet() ){
////            String name = entry.getKey();  // getKey - достаем ключ
//        }
    }
}

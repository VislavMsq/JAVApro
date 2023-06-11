import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    /*
1.++Написать POJO класс Employee с 4 полями name, department, age, salary
2.++Написать класс Generator
   ++ - который содержит только один метод который возвращает Лист с этими Employee.
3.++Написать класс DataBase
   ++ - который содержит Map dataBase = new TreeMap<>();
   ++ - и метод который будет добавлять в dataBase Employee,  а в качестве параметра принимать лист  Employee.
4.++Напишите класс с методом main
5.++В методе main создайте лист
   ++ - и сгенерируйте туда наших Employee через Generator
   ++ - далее передайте лист в dataBase.

!!! Метод который будет добавлять в dataBase Employee должен автоматически генерировать ключ.
    Т.е Integer ну и передавать туда по очереди наших Employee

     */
    public static void main(String[] args) {
        List<Employee> listEmployee = Generator.generateEmployee();

        DataBase dataBase = new DataBase();

        dataBase.addEmployee(listEmployee);
        dataBase.displayEmployees();

    }
}

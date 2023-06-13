package taskManager;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    public static void main(String[] args) {
        // создаем экземпляр TaskManager
        TaskManager taskManager = new TaskManager();
        // создаем задачи
        Task task = new Task("Task 1", "Make homework", true);
        Task task2 = new Task("Task 2", "Ride a bike", true);
        Task task3 = new Task("Task 3", "Go to the pool", false);
        // добавляем задачи
        taskManager.addTask(task);
        taskManager.addTask(task2);
        taskManager.addTask(task3);

        // создаем List и загружаем туда и выводим поле класса taskManager
        List<Task> tasks = taskManager.getAllTask();
        for (Task task1 : tasks){
            System.out.println("Title: " + task1.getTitle());
            System.out.println("Description -> " + task1.getDescription());
            System.out.println("Completed -> " + task1.isCompleted());
            System.out.println();
        }

        // создаем новый List и копируем в него данные из другого листа и печатаем их
        List<Task> newTaskList = new ArrayList<>();
        newTaskList.addAll(taskManager.getAllTask());
        System.out.println("New task ArrayList -> " + newTaskList);

        // Создаем массив, юзаем старый массив и через метод toArray создается новый массив new Task[0] размер массива
        // Task равен 0, потому что будет автоматически расширятся, если размера будет недостаточно, в результате
        // переменной taskBasicArray присваивается новый массив Task
        Task[] taskBasicArray = newTaskList.toArray(new Task[0]);
        for (Task taskBasic : taskBasicArray){
            System.out.println("Title basic array: " + taskBasic.getTitle());
            System.out.println("Description basic array -> " + taskBasic.getDescription());
            System.out.println("Completed basic array -> " + taskBasic.isCompleted());
            System.out.println();
        }
    }
}

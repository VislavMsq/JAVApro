package taskManager;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private List<Task> tasks; // обьявляет переменную tasks типа List<taskManager.Task>

    /**
     * Конструктор taskManager.TaskManager
     * мы инициализируем перменную tasks как новый экземпляр ArrayList
     */
    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    /**
     * Метод для добавляения задачи
     * Т.к task это экземпляр ArrayList, то мы используем его методы
     *
     * @param task наша задача
     */
    public void addTask(Task task) {
        tasks.add(task);
    }

    /**
     * Метод для удаления задачи
     *
     * @param task задача
     */
    public void removeTask(Task task) {
        tasks.remove(task);
    }

    /**
     * Метод для проверки выполнения задачи
     *
     * @return результат проверки
     */
    public List<Task> getCompletedTasks() {
        List<Task> completedTasks = new ArrayList<>();  // создаем новый лист для результатов
        for (Task task : tasks) {                       // проходим циклом по всем задачам
            if (task.isCompleted()) {                   // в условии проверм методом isCompleted
                completedTasks.add(task);               // если true то записываем в наш лист
            }
        }
        return completedTasks;                          // возвращаем лист
    }

    /**
     * Метод для проверки когда задача не выполнена
     * @return результат проверки
     */
    public List<Task> getIncompleteTasks() {            // аналогичный метод предыдущему, только проверяет на false
        List<Task> incompleteTasks = new ArrayList<>();
        for(Task task : tasks){
            if (!task.isCompleted()){                   // отличия в приставке !(не) к методу isCompleted
                incompleteTasks.add(task);
            }
        }
        return incompleteTasks;
    }

    /**
     * Метод возвращает список задач
     * Позволяет получить доступ к taskManager.Task вне класса
     *
     * @return задача
     */
    public List<Task> getAllTask() {
        return tasks;
    }


}

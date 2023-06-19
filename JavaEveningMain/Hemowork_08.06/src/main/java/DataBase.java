import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class DataBase {
    Map<Integer, Employee> dataBase;

    public DataBase() {
        this.dataBase = new TreeMap<>();
    }

    public void addEmployee(List<Employee> employees) {
        for (Employee employee : employees) {
            int key = generateKey();
            dataBase.put(key, employee);
        }
    }

    public static int generateKey() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public void displayEmployees() {
        for (Integer key : dataBase.keySet()) {
            Employee employee = dataBase.get(key);
            System.out.println("Key -> " + key + ", Employee -> " + employee);
        }
    }
}

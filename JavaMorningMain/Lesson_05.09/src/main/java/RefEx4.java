import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RefEx4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class managerClass = Class.forName("Manager");

        Constructor<Manager > constructor = managerClass.getConstructor();
        Manager objMen = constructor.newInstance();

        Method method = managerClass.getMethod("setSalary", double.class);
        method.invoke(objMen, 800.00);
        System.out.println(objMen);
    }
}

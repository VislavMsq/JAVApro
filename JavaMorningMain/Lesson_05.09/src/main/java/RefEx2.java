import java.lang.reflect.Method;
import java.util.Arrays;

public class RefEx2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class managerClass = Class.forName("JavaMorningMain.Lesson_05.09.Manager");
        Method method = managerClass.getMethod("increaseSalary");
        System.out.println("RETURN TYPE: " + method.getReturnType() + " : " + method.getReturnType());
        System.out.println("---------------------------------------------");

        Method method1 = managerClass.getMethod("setSalary", double.class);
        System.out.println("RETURN TYPE: " + method.getReturnType() + " : " + method.getReturnType());
        System.out.println(Arrays.toString(method1.getParameterTypes()));
        System.out.println("---------------------------------------------");

        Method[] methods = managerClass.getMethods();
        for (Method method2 : methods) {
            System.out.println("NAME: " + method2.getReturnType() + " : RETURN TYPE " + method2.getReturnType()
                    + " PARAM TYPE: " +  method1.getParameterTypes());
        }
    }
}

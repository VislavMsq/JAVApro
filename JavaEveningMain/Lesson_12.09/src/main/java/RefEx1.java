import java.lang.reflect.*;
import java.util.Arrays;

public class RefEx1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //Class securityClassObject = Security.class;
        Class<?> securityClassObject = Class.forName("Security");

        System.out.println("****************1***************");
        Field field = securityClassObject.getField("id");
        System.out.println("Field: " + field);

        Field[] fields = securityClassObject.getFields();
        for (Field field1 : fields) {
            System.out.println("Field[]: " + field1.getName() + ". Type: " + field1.getType());
        }

        System.out.println("****************2***************");
        Field[] fieldssss = securityClassObject.getDeclaredFields();
        for (Field fieldssss1 : fieldssss) {
            System.out.println("Declared Field[]: " + fieldssss1.getName() + ". Type: " + fieldssss1.getType());
        }

        System.out.println("****************3***************");
        Method method = securityClassObject.getDeclaredMethod("salaryUp");
        System.out.println("Methode: " + method.getName() + ". Return Type: " + method.getReturnType());

        System.out.println("****************4***************");
        Method method1 = securityClassObject.getMethod("setSalary", double.class);
        System.out.println("Methode: " + method1.getName() + ". Return Type: " + method1.getReturnType());

        System.out.println("****************4***************");
        Method[] methods = securityClassObject.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Declared Field[]: " + m.getName() + ". Type: " + m.getReturnType());
        }

        System.out.println("****************5***************");
        Constructor constructor = securityClassObject.getConstructor(int.class, String.class, String.class);
        System.out.println("Constractor parametr count: " + constructor.getParameterCount());
        System.out.println("Constractor parametr type: " + Arrays.toString(constructor.getExceptionTypes()));

        System.out.println("****************6***************");
        Constructor<Security> securityConstructor = (Constructor<Security>) securityClassObject.getConstructor();
        Security obj = securityConstructor.newInstance();
        System.out.println(obj);

        Constructor constructor1 = securityClassObject.getConstructor(int.class, String.class, String.class);
        Object object = constructor1.newInstance(1, "John", "IT");
        System.out.println(object);

        System.out.println("****************7***************");
        Method method2 = securityClassObject.getMethod("setSalary", double.class);
        method2.invoke(object, 9999);
        System.out.println(object);
    }
}

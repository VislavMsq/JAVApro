import java.lang.reflect.Constructor;

public class RefEx3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class managerClass = Class.forName("JavaMorningMain.Lesson_05.09.Manager");
        Constructor constructor = managerClass.getConstructor();
        System.out.println("NAS: " + constructor.getParameterCount());
        System.out.println("-----------------------------------------------------");

        Constructor[] constructors = managerClass.getConstructors();
    }
}

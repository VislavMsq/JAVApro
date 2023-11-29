import java.lang.reflect.Field;

public class RefEx1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class managerClass = Class.forName("Manager");
        Field field = managerClass.getField("id");
        System.out.println("Field: " + field.getType());
        System.out.println("----------------------------------------------");

        Field[] fields = managerClass.getFields();
        for (Field field1 : fields) {
            System.out.println("Field name: " + field1.getName() + " | Field type: " + field1.getType());
        }
        System.out.println("----------------------------------------------");

        Field[] withPrivateFields = managerClass.getDeclaredFields();
        for (Field withPrivateField : withPrivateFields) {
            System.out.println("!P! Field name: " + withPrivateField.getName() + " | Field type: " + withPrivateField.getType());
        }
        System.out.println("----------------------------------------------");
    }
}

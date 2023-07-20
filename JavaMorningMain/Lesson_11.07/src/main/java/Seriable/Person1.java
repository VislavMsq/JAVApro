package Seriable;

import fileReader.filelO.FileInputStreamAndOutputStream;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.*;

@Getter
@ToString
@AllArgsConstructor
public class Person1 implements Serializable{
    private String name;
    private int age;
}

class SerialEx1 {
    public static void main(String[] args) {
        Person1 person1 = new Person1("John", 22);
        System.out.println("Before serial: ");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());

        // serialized
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("person.ser");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(person1);

            outputStream.close();
            fileOutputStream.close();
            System.out.println("Object was serialized");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        person1 = null;
        System.out.println(person1);

        // de serialized
        try {
            FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            person1 = (Person1) in.readObject();
            System.out.println("Object was deserialized");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        if(person1 != null){
            System.out.println("After serial: ");
            System.out.println("Name: " + person1.getName());
            System.out.println("Age: " + person1.getAge());
        }

    }
}


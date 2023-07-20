package Seriable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serial;

@Getter
@ToString
@AllArgsConstructor
public class MyClass {

    @Serial
    private static final long serialVersionUID = 1l;
    private String name;
    private int age;
}

class SerialExample {
    public static void serializeObject(String fileName, Object obj){

    }
}
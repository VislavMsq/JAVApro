package streamFocusi.taskiObj.fileForClass;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor

public class Student {
    private String name;
    private int mark;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "\nname: " + name +
                "\nmark: " + mark +
                "\nage:  " + age +
                "\n}";
    }
}

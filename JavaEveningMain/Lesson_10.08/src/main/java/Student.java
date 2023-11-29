import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Student {
    private String firstName;
    private String lastName;
    private final List<Integer> grades = new ArrayList<>();

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return getFirstName() + " " + lastName;
    }

    public void addGrade(int mark) {
        if (mark <= 10 && mark >= 1) {
            grades.add(mark);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void clear() {
        grades.clear();
    }
}

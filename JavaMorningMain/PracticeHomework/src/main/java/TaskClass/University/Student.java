package TaskClass.University;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class Student {
    private String firstName;
    private String surName;
    private int age;
    private int course;
    private List<Subject> subjectList;
    private StatusStudent statusStudent;

    @Override
    public String toString() {
        return "\nStudent: [" +
                "\nfirstName:     " + firstName +
                "\nsureName:      " + surName +
                "\nage:           " + age +
                "\ncourse:        " + course +
                "\nstatusStudent: " + statusStudent + "]";
    }
}

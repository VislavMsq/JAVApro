package School;

import School.enums.Group;
import School.enums.Subject;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Getter
@ToString
@Setter
public class Student {
    private String name;
    private Group group = null;
    private Set<Subject> subjectSet = null;

    public Student(String name) {
        this.name = name;
    }
}


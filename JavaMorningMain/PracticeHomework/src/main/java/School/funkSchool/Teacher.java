package School.funkSchool;

import School.enums.Group;
import School.enums.Subject;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
public class Teacher {
    private String name;
    private Subject subject;
    private Set<Group> groupSet;

    public Teacher(String name, Subject subject, Set<Group> groupSet) {
        this.name = name;
        this.subject = subject;
        this.groupSet = new HashSet<>();
    }
}

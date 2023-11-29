package example5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Student implements Comparable<Student> {
    private String name;
    private int grade;

    @Override
    public int compareTo(Student o) {
        if (this.grade < o.grade) {
            return -1;
        } else if (this.grade > o.grade) {
            return +1;
        } else {
            return 0;
        }
    }
}

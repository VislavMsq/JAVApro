package TaskClass.University;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Student> students = GenerateStudent.generateStudent(10);

        List<Student> test = new ArrayList<>();


        List<Subject> sTest2 = new ArrayList<>(List.of(
                new Subject(SubjectList.MATH, Mark.C),
                new Subject(SubjectList.LITERATURE, Mark.C)));

        List<Subject> sTest1 = new ArrayList<>(List.of(
                new Subject(SubjectList.HISTORY, Mark.A),
                new Subject(SubjectList.MATH, Mark.A)));

        test.add(new Student("a", "b", 20, 2, sTest1, StatusStudent.OUTSTANDING_STUDENT));
        test.add(new Student("a", "b", 20, 2, sTest1, StatusStudent.OUTSTANDING_STUDENT));
        test.add(new Student("a", "b", 20, 2, sTest1, StatusStudent.OUTSTANDING_STUDENT));
        test.add(new Student("a", "b", 20, 2, sTest1, StatusStudent.OUTSTANDING_STUDENT));
        test.add(new Student("a", "b", 20, 2, sTest1, StatusStudent.OUTSTANDING_STUDENT));

        test.add(new Student("a", "b", 20, 2, sTest2, StatusStudent.TYPICAL_STUDENT));
        test.add(new Student("a", "b", 20, 2, sTest2, StatusStudent.TYPICAL_STUDENT));
        test.add(new Student("a", "b", 20, 2, sTest2, StatusStudent.TYPICAL_STUDENT));


//        test.forEach(el -> {
//            System.out.print("---------------------------------------");
//            System.out.println(el);
//        });

        System.out.println(Handler.averageOfCourse(test, SubjectList.MATH)); // todo нарешті

    }
}

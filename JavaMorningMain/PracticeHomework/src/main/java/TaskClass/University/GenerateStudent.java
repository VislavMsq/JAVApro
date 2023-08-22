package TaskClass.University;

import com.github.javafaker.Faker;

import java.util.*;

public class GenerateStudent {

    public static Student generateStudent() {
        Random random = new Random();
        Faker faker = new Faker(new Locale("uk-UA"));
        String name = faker.name().firstName();
        String surname = faker.name().lastName();
        int old = random.nextInt(18, 25);

        StatusStudent randomStatus = StatusStudent.values()[random.nextInt(StatusStudent.values().length)];


        List<Subject> subjectList = new ArrayList<>();
        for (SubjectList sub : SubjectList.values()) {

            int intMark = 0;

            switch (randomStatus) {
                case OUTSTANDING_STUDENT -> intMark = random.nextInt(80, 101);
                case TYPICAL_STUDENT -> intMark = random.nextInt(60, 101);
                case LAGGING_STUDENT -> intMark = random.nextInt(0, 101);
            }

            /*
            A,  (90-100): Отлично
            B,  (80-89):  Хорошо
            C,  (70-79):  Удовлетворительно
            D,  (60-69):  Плохо
            E,  (50-59):  Ниже среднего
            F   (0-49):   Неудовлетворительно
            */

            Mark mark;
            if (intMark >= 90) {
                mark = Mark.A;
            } else if (intMark >= 80) {
                mark = Mark.B;
            } else if (intMark >= 70) {
                mark = Mark.C;
            } else if (intMark >= 60) {
                mark = Mark.D;
            } else if (intMark >= 50) {
                mark = Mark.E;
            } else {
                mark = Mark.F;
            }

            subjectList.add(new Subject(sub, mark));
        }

        Mark mark = subjectList.stream()
                .map(Subject::getMark)
                .max(Comparator.naturalOrder())
                .orElse(null);

        switch (mark) {
            case F, E -> randomStatus = StatusStudent.LAGGING_STUDENT;
            case D, C -> randomStatus = StatusStudent.TYPICAL_STUDENT;
            case B, A -> randomStatus = StatusStudent.OUTSTANDING_STUDENT;
        }

        return new Student(name, surname, old, old - 17, subjectList, randomStatus);

    }

    public static List<Student> generateStudent(int num) {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            students.add(generateStudent());
        }
        return students;
    }
}

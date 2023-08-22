package TaskClass.University;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Handler {
    public static void displayExelStudent(List<Student> stdList) {

        int firstNameLen = 9;
        int lastNameLen = 8;

        for (Student student : stdList) {
            if (student.getFirstName().length() > firstNameLen) {
                firstNameLen = student.getFirstName().length();
            }
            if (student.getSurName().length() > lastNameLen) {
                lastNameLen = student.getSurName().length();
            }
        }
        StringBuilder stringBuilder = new StringBuilder(String.format(
                "%-" + firstNameLen + "s" +
                        " %-" + lastNameLen + "s |",
                "firstName", "lastName"));
        for (SubjectList value : SubjectList.values()) {
            stringBuilder.append(String.format(" %-14s|", value));
        }
        stringBuilder.append(String.format("\n%" + (firstNameLen + 1 + lastNameLen + SubjectList.values().length * 16 + 2)
                + "s", "").replace(" ", "-"));

        for (Student student : stdList) {
            stringBuilder.append(String.format("\n%-" + firstNameLen + "s %-" + lastNameLen + "s |",
                    student.getFirstName(), student.getSurName()));
            for (Subject subject : student.getSubjectList()) {
                stringBuilder.append(String.format(" %-14s|", subject.getMark()));
            }
        }
        System.out.println(stringBuilder);
    }

    public static List<Student> studentOfCourse(List<Student> students, int course) {
        return students.stream()
                .filter(el -> el.getCourse() == course)
                .toList();
    }

    public static Mark averageOfCourse(List<Student> students, SubjectList subject) {
        Map<Mark, Long> marks = students.stream()
                .flatMap(el -> el.getSubjectList().stream())
                .filter(subject1 -> subject1.getSubjectList().equals(subject))
                .map(Subject::getMark)
                .collect(Collectors.groupingBy(el -> el, Collectors.counting()));

        long fullCost = 0L;
        int markCount = 0;

        for (Map.Entry<Mark, Long> marp : marks.entrySet()) {
            markCount += marp.getValue();
            fullCost += ((int) 'G' - (int) marp.getKey().toString().charAt(0)) * marp.getValue();
        }

        if (markCount == 0) {
            System.out.println("====== Not founded Subject ======");
            return null;
        }
        double num = (double) fullCost / markCount;

        String[] nums = Double.toString(num).split("\\.");

        int i = Integer.parseInt(nums[0]) + (Integer.parseInt(Character.toString(nums[1].charAt(0))) > 4 ? 1 : 0);

        // ( (5+5) * (3 + 7)) / 4

        for (Mark m : Mark.values()) {
            if (m.toString().equals(Character.toString((char) ((int) 'G' - i)))) {
                return m;
            }
        }
        System.out.println("====== Not founded Subject ======");
        return null;

    }
}


package School;

import School.enums.Group;
import School.enums.Subject;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;

/*
 Создайте класс "Учебное заведение" (EducationalInstitution), который имеет поля: список преподавателей (teachers) и
 список студентов (students). Класс "Преподаватель" (Teacher) имеет поля: имя (name), предмет (subject) и список
 преподаваемых групп (teachingGroups). Класс "Студент" (Student) имеет поля: имя (name), группа (group) и список
 предметов (subjects). Добавьте методы для добавления преподавателей и студентов, а также для добавления студентов в
 группы и назначения им предметов.

 class EducationalInstitution
    List<Teachers>
    List<Student>

                methode:
                        addTeacherAndStudent

class Teacher
     String name;
     Enum subject;
     Set<Enum group>;

class Student
     Set<Enum subject>;
     Enum group;

                methode:
                        addStudentGroup;
                        addSubject;

 */
@ToString
@Getter
@Setter

public class EducationalInstitution {
    private List<Teacher> teacherList;
    private List<Student> studentList;
    private Map<Group, Set<Subject>> groupSetMap;

    public EducationalInstitution(Map<Group, Set<Subject>> groupSetMap) {
        this.teacherList = new ArrayList<>();
        this.studentList = new ArrayList<>();
        this.groupSetMap = groupSetMap; // (a: [a1 b2], b:[a1, c4])
    }

    //

}

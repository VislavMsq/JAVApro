import java.util.*;

public class SetEx1 {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();


        Student s1 = new Student("Rayana", 25, 2);
        Student s2 = new Student("Nam", 28, 4);
        Student s3 = new Student("Egor", 18, 2);
        Student s4 = new Student("Vlad", 28, 1);
        Student s5 = new Student("Lera", 35, 5);
        Student s6 = new Student("Anna", 20, 5);
        Student s7 = new Student("Dima", 40, 2);


        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        set.add(s5);
        set.add(s6);
        set.add(s7);


        s1.compareTo(s1);
//        Collections.sort(set, new StudentAgeComparator());

        System.out.println(set);
    }
}


class Student implements Comparable<Student> {
    String name;
    int age;
    int course;

    public Student(String name, int age, int course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    static class StudentAgeComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.age - o2.age;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }

    // Student stud = new Student();
    // Student stud22 = new Student();
    // stud.compareTo(stud22)
    @Override
    public int compareTo(Student elem) {
        int a = 0;
        if (this.age == elem.age) {
            a = this.name.compareTo(elem.name);
        }
        return a;
//        return this.course -elem.course;     // -  по цифрам
//        return this.name.compareTo(elem.name);  // по стрингу
    }
}


// у КЛАССА есть ПОЛЯ
// Почтальен приносит почту

// существительное - Класс
// глагол - метод
// какой/что есть - это поля

class Postman {
    boolean bring(Post post) {
        return false;
    }
}

class Post {
    String address;
}
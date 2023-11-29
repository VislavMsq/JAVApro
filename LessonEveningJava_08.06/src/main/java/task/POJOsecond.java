package task;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collector;

public class POJOsecond implements Comparable<POJOsecond>, Comparator<POJOsecond> {
    private String name;
    private String surName;
    private String group;
    private int age;
    private double grade;

    public POJOsecond(String name, String surName, String group, int age, double grade) {
        this.name = name;
        this.surName = surName;
        this.group = group;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public int compare(POJOsecond o1, POJOsecond o2) {
        return o1.age - o2.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        POJOsecond that = (POJOsecond) o;
        return age == that.age && Double.compare(that.grade, grade) == 0 && Objects.equals(name, that.name) && Objects.equals(surName, that.surName) && Objects.equals(group, that.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, group, age, grade);
    }

    @Override
    public int compareTo(POJOsecond o) {
        return this.age -o.age;
    }

    @Override
    public String toString() {
        return "POJOsecond{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", group='" + group + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}



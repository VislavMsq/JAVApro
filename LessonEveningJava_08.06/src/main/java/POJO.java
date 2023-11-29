import java.util.Objects;

public class POJO {
    private String name;
    private String surName;
    private int age;
    private double salary;

    public POJO(String name, String surName, int age, double salary) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.salary = salary;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        POJO pojo = (POJO) o;
        return age == pojo.age && Double.compare(pojo.salary, salary) == 0 && Objects.equals(name, pojo.name) && Objects.equals(surName, pojo.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName, age, salary);
    }
}

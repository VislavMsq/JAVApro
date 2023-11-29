public class Security {
    public int id;
    public String name;
    public String department;
    @lombok.Getter
    private double salary;

    public Security() {
    }

    public Security(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Security(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private void changeDepartmenty(String newDep) {
        department = newDep;
        System.out.println("New Department: " + newDep);
    }

    private void salaryUp() {
        salary *= 1.15;
    }

    @Override
    public String toString() {
        return "Security{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

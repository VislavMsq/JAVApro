import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Manager {
    public int id;
    public String name;
    public String department;
    private double salary;

    public Manager(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    private void changeDepartment(String newDep){
        department = newDep;
        System.out.println("New dep: " + newDep);
    }

    public void increaseSalary(){
        salary *= 1.25;
    }

}



import java.util.List;

public class MainMain {
    public static void main(String[] args) {
        List<Developer> developers = Generator.generateDeveloper(20);

        CarWorked.showSportCarMen(developers).forEach(System.out::println);

        System.out.println(CarWorked.writeAllDevelopers(developers, "dev.txt"));

        CarWorked.autoGroupGender(developers).forEach((key, value) -> {
            System.out.println(key);
            value.forEach(System.out::println);
        });

        CarWorked.groupMaxSpeed(developers).entrySet().forEach(System.out::println);

    }
}

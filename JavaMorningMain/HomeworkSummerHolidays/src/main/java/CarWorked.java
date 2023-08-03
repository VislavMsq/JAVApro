import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ToString
@Setter
@Getter
public class CarWorked {
    public static List<Developer> showSportCarMen(List<Developer> developerList) {
        return developerList.stream()
                .filter(el -> el.getGender() == 'M')
                .filter(el -> el.getCar().isSport())
                .toList();
    }

    public static Map<Character, List<Car>> autoGroupGender(List<Developer> developerList) {
        return developerList.stream()
                .collect(Collectors.groupingBy(Developer::getGender,
                        Collectors.mapping(Developer::getCar, Collectors.toList())));
    }

    public static boolean writeAllDevelopers(List<Developer> developerList, String filename) {
        try (FileWriter fileWriter = new FileWriter(filename)) {
            for (Developer developer : developerList) {

                String fString = String.format("%s-[auto: %s ::: salary: %d]\n",
                        developer.getFirstName(),
                        developer.getCar().getBrandAuto()
                        , developer.getSalary());
                fileWriter.write(fString);
            }
            return true;

        } catch (IOException e) {
            return false;
        }
    }

    public static Map<Developer, Integer> groupMaxSpeed(List<Developer> developerList) {
        return developerList.stream()
                .collect(Collectors.toMap(el -> el, el2 -> el2.getCar().getMaxSpeed()));
    }
}

package School;

import School.enums.Group;
import School.enums.Subject;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class School {
    public static void main(String[] args) {

        Map<Group, Set<Subject>> map = new HashMap<>();

        map.put(Group.Q12, Set.of(Subject.GEOMETRY, Subject.MATHEMATICS));
        map.put(Group.W13, Set.of(Subject.PHYSICS, Subject.CHEMISTRY));


        EducationalInstitution educationalInstitution = new EducationalInstitution(map);


    }
}

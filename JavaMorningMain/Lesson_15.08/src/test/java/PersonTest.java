import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void isAdult() {
        Person person1 = new Person("p1", Person.LEGAL_AGE - 1, "a1");
        Person person2 = new Person("p1", Person.LEGAL_AGE, "a2");
        Person person3 = new Person("p1", Person.LEGAL_AGE + 1, "a3");

        Assertions.assertFalse(person1.isAdult());
        Assertions.assertTrue(person2.isAdult());
        Assertions.assertTrue(person3.isAdult());
    }

    @Test
    void compareTo() {
        Person p1 = new Person("p1", Person.LEGAL_AGE, "a1");
        Person p2 = new Person("p1", Person.LEGAL_AGE, "a3");
        Person p3 = new Person("p2", Person.LEGAL_AGE, "a3");

        Assertions.assertTrue(p1.compareTo(p3) > 0);
        Assertions.assertEquals(0, p1.compareTo(p2));
        Assertions.assertTrue(p3.compareTo(p1) > 0);
    }
}
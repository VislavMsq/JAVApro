import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTest {

    private static final Student student = new Student("John", "Jonson");

    @BeforeEach
    void clear() {
        student.clear();
    }

    @Test
    void addGradeTest() {
        student.addGrade(3);
        Assertions.assertEquals(1, student.getGrades().size());
    }

    @Test
    void getExceptionFullNameTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> student.addGrade(11));
    }

    @Test
    void getFullNameTest() {
        Assertions.assertEquals("John Jonson", student.getFullName());
    }
}
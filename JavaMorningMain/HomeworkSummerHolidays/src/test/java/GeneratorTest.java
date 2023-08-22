import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GeneratorTest {

    @Test
    void getMaleGenderTest() {
        String manName = "John";
        char result = Generator.getGender(manName);
        Assertions.assertEquals('M', result);
    }

    @Test
    void getFemaleGenderTest() {
        String girlName = "Asaeu";
        char result = Generator.getGender(girlName);
        Assertions.assertEquals('F', result);
    }
}
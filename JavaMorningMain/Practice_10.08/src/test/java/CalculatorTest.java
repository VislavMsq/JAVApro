import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @BeforeAll  // метод вызывается в самом начале тестирование
    static void start() { // метод дожен быть статическим, чтобы быть единым для всех обьектов класса
        System.out.println("Старт тестирования:");
    }

    @BeforeEach// метод будет вызываться перед каждым тестом

    void before() {
        System.out.println("Тест начался:");
    }

    @AfterEach // метод вызываемый после каждого теста

    void after() {
        System.out.println("Тест закончился.");
    }

    @Test
    void sumTest() {
        System.out.println("Тестирунем суммирование");
        Assertions.assertEquals(4, calculator.sum(2, 2));
    }

    @Test
        // анотация делает метод тестом
    void subTest() {
        System.out.println("Тестирунем вычетание");
        Assertions.assertEquals(4, calculator.sub(6, 2));
    }

    @Test
    void mulTest() {
        System.out.println("Тестирунем умножение");
        Assertions.assertEquals(4, calculator.mul(2, 2));
    }

    @Test
    void divTest() {
        System.out.println("Тестирунем деление");
        Assertions.assertEquals(5, calculator.div(10, 2));
    }
}
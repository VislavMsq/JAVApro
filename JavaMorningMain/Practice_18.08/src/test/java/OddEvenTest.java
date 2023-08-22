import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import streamAPI.OddEven;
import streamAPI.OddEvenTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenTest {

    public static OddEvenTask oddEvenTask = new OddEvenTask();

    @BeforeEach
    void setUp() {
    }

    @Test
    void tenShouldGoToEvenTest() {
        // given \
        // when -  основа всех тестов, эти три этапа
        // then /
        List<Integer> num = List.of(1, 2, 3, 4, 10);
        OddEven oddEven = oddEvenTask.oddEvenPartition(num);
        assertTrue(oddEven.getEvenNums().contains(10));
    }

    @Test
    void tenShouldGoToOddTest() {
        List<Integer> num = List.of(1, 2, 3, 4, 10);
        OddEven oddEven = oddEvenTask.oddEvenPartition(num);
        assertTrue(oddEven.getOddNums().contains(1));
    }

    @Test
    void zeroShouldGoToOddTest() {
        List<Integer> num = List.of(1, 2, 3, 4, 0);
        OddEven oddEven = oddEvenTask.oddEvenPartition(num);
        assertTrue(oddEven.getEvenNums().contains(0));
    }

    @Test
    void nullShouldGoToOddTest() {
        List<Integer> num = new ArrayList<>(Arrays.asList(null, 2, 3, 4, 0));
        assertThrows(IllegalArgumentException.class, () -> oddEvenTask.oddEvenPartition(num));
    }

}
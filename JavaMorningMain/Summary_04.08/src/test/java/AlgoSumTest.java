import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlgoSumTest {
    private final AlgoSum algoSum = new AlgoSum();

    @Test
    void shouldTestSum() {
        int sum = algoSum.sum(new int[]{1, 2, 3});

        assertEquals(6, sum);
    }
}
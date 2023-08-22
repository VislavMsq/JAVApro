import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void calculateTotalPrice() {
        Product p1 = Mockito.mock(Product.class);
        Product p2 = Mockito.mock(Product.class);

        Mockito.when(p1.getPrice()).thenReturn(10.0);
        Mockito.when(p2.getPrice()).thenReturn(20.0);

        Order order = new Order(1, null, List.of(p1, p2), null);

        assertEquals(30.0, order.calculateTotalPrice());
    }

    @Test
    void isOrderExpired() {
        Order o1 = new Order(1, null, null, LocalDate.now());
        Order o2 = new Order(2, null, null, LocalDate.now().minusDays(Order.DAYS_BEFORE_EXPIRATION + 1));

        assertFalse(o1.isOrderExpired());
        assertTrue(o2.isOrderExpired());

    }
}
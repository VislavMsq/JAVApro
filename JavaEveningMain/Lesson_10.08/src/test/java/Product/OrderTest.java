package Product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class OrderTest {


    private final Order order = new Order(1234, "John", Status.NEW);

    static Product product = new Product(1234, "Iphone 14pro", 1500, 10);

    @BeforeEach
    void clear() {
        order.clear();
    }

    @Test
    void addProductTest() {
        order.addProduct(product, 2);
        Assertions.assertEquals(2, order.buscketCount());
    }

    @Test
    void addProductExceptionTest() {
        Assertions.assertThrows(NotEnoughQuantityException.class, () -> order.addProduct(product, 11));
    }

    @Test
    void updateOrderStatusTest() {
        order.setStatus(Status.NEW);

        assertEquals(Status.NEW, order.getStatus());

        order.changeStatus("DELIVERED");

        assertEquals(Status.DELIVERED, order.getStatus());
    }

    @Test
    void calculateTotalPriceTest() {
        Product product1 = Mockito.mock(Product.class);
        Product product2 = Mockito.mock(Product.class);
        Order order1 = Mockito.mock(Order.class);

        when(product1.getAvailableQuantity()).thenReturn(5);
        when(product1.getPrice()).thenReturn(300);

        when(product2.getAvailableQuantity()).thenReturn(2);
        when(product2.getPrice()).thenReturn(200);

        when(order1.getListProd()).thenReturn(List.of(product1, product2));

        Assertions.assertEquals(1900, OrderManager.calculateTotalPrice(order1));
    }
}
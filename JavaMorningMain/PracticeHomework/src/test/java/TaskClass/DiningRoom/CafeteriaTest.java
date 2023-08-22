package TaskClass.DiningRoom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

class CafeteriaTest {
    Order order1;
    Order order2;
    Cafeteria cafeteria;

    @BeforeEach
    void clear() {
        order1 = Mockito.mock(Order.class);
        order2 = Mockito.mock(Order.class);
        cafeteria = new Cafeteria();
    }

    @Test
    void addOrderTest() {
        cafeteria.addOrder(order1);

        Assertions.assertEquals(1, cafeteria.getOrderList().size());
    }

    @Test
    void averageOrderPriseTest() {
        when(order2.getPrice()).thenReturn(10.);
        when(order1.getPrice()).thenReturn(20.);

        cafeteria.addOrder(order1);
        cafeteria.addOrder(order2);

        Assertions.assertEquals(15.0, cafeteria.averageOrderPrise());
    }

    @Test
    void popularDishTest() {
        Assertions.assertEquals(cafeteria.popularDish(), new ArrayList<>());

        Dish dish1 = Mockito.mock(Dish.class);
        when(dish1.getCategory()).thenReturn(Category.DESERT);
        Dish dish2 = Mockito.mock(Dish.class);
        when(dish2.getCategory()).thenReturn(Category.SNACKS);

        when(order2.getDishList()).thenReturn(List.of(dish1, dish1, dish2));

        cafeteria.addOrder(order2);

        Assertions.assertEquals(List.of(Category.DESERT), cafeteria.popularDish());
    }

}
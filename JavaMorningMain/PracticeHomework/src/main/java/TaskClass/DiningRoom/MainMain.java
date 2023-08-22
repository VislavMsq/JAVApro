package TaskClass.DiningRoom;

public class MainMain {
    public static void main(String[] args) {
        Cafeteria cafeteria = new Cafeteria();

        Order order1 = new Order(3);
        order1.addDish(new Dish("МакСупчик", 80, Category.MAIN_COURSE));

        Order order2 = new Order(5);
        order2.addDish(new Dish("МакФлури", 8.50, Category.DESERT));
        order2.addDish(new Dish("МакСанди", 8.50, Category.DESERT));

        order1.getCheck("13-08::15-27");
        order2.getCheck("13-08::17-12");

        cafeteria.addOrder(order1);
        cafeteria.addOrder(order2);

        cafeteria.displayAllOrder();

        System.out.println(cafeteria.averageOrderPrise());

//        cafeteria.popularDish().forEach((key, val) -> {
//            System.out.println(key);
//            System.out.println(val);
//        });

    }
}

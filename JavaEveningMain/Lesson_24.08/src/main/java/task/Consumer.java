package task;

public class Consumer implements Runnable{
    private Warehouse warehouse;

    public Consumer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void consumeItems(int amount) {
        warehouse.consume(amount);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            warehouse.consume(3);
        }
    }
}

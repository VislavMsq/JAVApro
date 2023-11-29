package task;

public class Producer implements Runnable{
    private Warehouse warehouse;

    public Producer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            warehouse.consume(5);
        }
    }
}

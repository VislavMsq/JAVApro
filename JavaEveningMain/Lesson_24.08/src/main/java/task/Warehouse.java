package task;

public class Warehouse {
    private final int capacity;
    private volatile int availableItems;

    public Warehouse(int capacity) {
        this.capacity = capacity;
        this.availableItems = 0;
    }

    public synchronized void produce(int amount) {
        while (availableItems + amount > capacity) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        availableItems += amount;
        System.out.println("Produce " + amount + " availableItems: " + availableItems);
        notify();
    }

    public synchronized void consume(int amount) {
        while (amount > capacity) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        availableItems -= amount;
        System.out.println("Consume " + amount + " availableItems: " + availableItems);
        notify();
    }
}

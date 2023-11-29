package task;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(10);

        Thread producerThread = new Thread(new Consumer(warehouse));
        Thread consumerThread = new Thread(new Producer(warehouse));

        producerThread.start();
        consumerThread.start();
    }
}

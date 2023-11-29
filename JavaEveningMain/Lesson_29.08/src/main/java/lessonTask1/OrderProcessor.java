package lessonTask1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OrderProcessor {
    private ExecutorService threadPool;

    public OrderProcessor(int threadNum) {
        this.threadPool = Executors.newFixedThreadPool(threadNum);
    }

    public void processOrder(Order order) {

    }
}

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new ERun());
        }
        executorService.awaitTermination(20, TimeUnit.SECONDS);
        executorService.shutdown();
        System.out.println("MAIN END");
    }
}

class ERun implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "===START");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + "===END");

    }
}

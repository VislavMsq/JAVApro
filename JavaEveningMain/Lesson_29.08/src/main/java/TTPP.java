import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TTPP {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("MAIN START");
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 11; i++) { // передаем 11 тасок из класса U2
            executorService.execute(new U2());
        }

        executorService.shutdown();
        executorService.awaitTermination(4, TimeUnit.SECONDS); // todo почему мейн стопает в середине
        System.out.println("MAIN END");
    }
}

class U2 extends Thread {
    @Override
    public void run() {
        System.out.println("START: " + Thread.currentThread().getName());
        for (int i = '!'; i < '*'; i++) {
            try {
                System.out.println("CHAR: " + (char) i + " : " + Thread.currentThread().getName());
                Thread.sleep(222);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("END: " + Thread.currentThread().getName());
    }
}
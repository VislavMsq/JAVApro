import java.util.concurrent.CountDownLatch;

public class CDL {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void prepareSystem() {
        try {
            Thread.sleep(666);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        countDownLatch.countDown(); // обратный отсчет
        System.out.println("[System was prepared] [COUNTER: " + countDownLatch.getCount() + "]");
    }

    private static void writeLog() {
        try {
            Thread.sleep(999);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        countDownLatch.countDown(); // обратный отсчет
        System.out.println("[Log file was wrote] [COUNTER: " + countDownLatch.getCount() + "]");
    }

    private static void startSystem() {
        try {
            Thread.sleep(1111);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        countDownLatch.countDown(); // обратный отсчет
        System.out.println("[System is starting ...] [COUNTER: " + countDownLatch.getCount() + "]");
    }


    public static void main(String[] args) {
        new Systems("SYSTEM_W", countDownLatch);
        new Systems("SYSTEM_T", countDownLatch);
        new Systems("SYSTEM_J", countDownLatch);
        new Systems("SYSTEM_L", countDownLatch);
        new Systems("SYSTEM_B", countDownLatch);
        new Systems("SYSTEM_D", countDownLatch);

        prepareSystem();
        writeLog();
        startSystem();
    }
}

class Systems extends Thread {
    String typeSyst;
    private CountDownLatch countDownLatch;

    public Systems(String typeSyst, CountDownLatch countDownLatch) {
        this.typeSyst = typeSyst;
        this.countDownLatch = countDownLatch;
        this.setName("T--> " + typeSyst);
        this.start();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await(); // не пропускает потоки
            System.out.println(typeSyst + "[working...]" + "THREAD: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
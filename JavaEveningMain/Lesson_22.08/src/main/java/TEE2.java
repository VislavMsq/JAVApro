public class TEE2 {
    volatile static int counter = 0;

    public static void increment() {
        synchronized (TEE2.class) {
            counter++;
            System.out.println("COUNT: " + counter);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Ri2());
        Thread t2 = new Thread(new Ri2());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter);
    }
}

class Ri2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 8; i++) {
            TEE2.increment();
        }
    }
}
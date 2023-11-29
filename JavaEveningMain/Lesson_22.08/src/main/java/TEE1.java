public class TEE1 {
    public static void main(String[] args) {
        RI run = new RI();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);

        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Counter {
    static int count = 0;
}

class RI implements Runnable {
    public void increment() {
        synchronized (this) {
            Counter.count++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("COUNT: " + Counter.count + " : " + Thread.currentThread().getName());
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 8; i++) {
            increment();
        }
    }
}
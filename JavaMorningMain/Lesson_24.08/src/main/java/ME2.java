package src.main.java;

public class ME2 {
    static int counter = 0;

    public static void increment() {
        synchronized (ME2.class) {
            counter++;
            System.out.println("NAME: " + Thread.currentThread().getName() + " || COUNT: " + counter);
        }
    }


    public static void main(String[] args) throws InterruptedException {
        RII ri = new RII();
        Thread t1 = new Thread(ri);
        Thread t2 = new Thread(ri);
        Thread t3 = new Thread(ri);

        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }
}

class RII implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            ME2.increment();
        }
    }
}
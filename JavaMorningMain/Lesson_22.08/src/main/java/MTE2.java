public class MTE2 {
    public static void main(String[] args) throws InterruptedException {
        MyT1 t1 = new MyT1();
        MyT2 t2 = new MyT2();

        t1.start();
        t2.start();

        t2.join();
        t1.join();

        System.out.println("##########");
    }
}

class MyT1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("MyT1: " + i);
        }
    }
}

class MyT2 extends Thread {
    @Override
    public void run() {
        for (int i = 100; i > 0; i--) {
            System.out.println("MyT2: " + i);
        }
    }
}
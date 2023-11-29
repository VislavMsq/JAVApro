public class Deam {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("MAIN START");
        U1 u1 = new U1();
        D1 d1 = new D1();

        u1.setName("U1");
        d1.setName("D1");

        d1.setDaemon(true);

        u1.start();
        d1.start();

        System.out.println("MAIN END");
    }
}

class U1 extends Thread {
    @Override
    public void run() {
        System.out.println("START: " + Thread.currentThread().getName());
        System.out.println("DAEMON: " + isDaemon());
        for (int i = '!'; i < '}'; i++) {
            try {
                System.out.println("CHAR: " + (char) i + " : " + Thread.currentThread().getName());
                Thread.sleep(111);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("*****END: " + Thread.currentThread().getName());
    }
}

class D1 extends Thread {
    @Override
    public void run() {
        System.out.println("START: " + Thread.currentThread().getName());
        System.out.println("DAEMON: " + isDaemon());
        for (int i = 1; i < 20; i++) {
            try {
                System.out.println("INT: " + i);
                Thread.sleep(555);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("*****END: " + Thread.currentThread().getName());
    }
}

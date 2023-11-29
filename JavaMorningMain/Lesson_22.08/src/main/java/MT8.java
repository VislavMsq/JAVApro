public class MT8 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main start");
        Thread thread = new Thread(new R1());
        System.out.println("T1: " + thread.getState());

        Thread thread2 = new Thread(new R2());
        System.out.println("T1: " + thread2.getState());

        thread.start();
        thread2.start();

        thread.join();
        thread2.join();

        System.out.println("Main end");
    }
}

class R1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("R1 " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("T1 END");
    }
}

class R2 implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println("R2 " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("T2 END");
    }
}
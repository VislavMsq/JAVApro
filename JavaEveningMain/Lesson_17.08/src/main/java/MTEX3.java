public class MTEX3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MT1());
        Thread t2 = new Thread(new MT2());
        t1.start();
        t2.start();
    }
}

class MT1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("UP: " + i);
        }
    }
}
class MT2 implements Runnable {

    @Override
    public void run() {
        for (int i = 200; i > 0; i--) {
            System.out.println("DOWN: " + i);
        }
    }
}

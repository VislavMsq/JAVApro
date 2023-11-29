public class ME4 {
    public static final Object LOCK_1 = new Object();
    public static final Object LOCK_2 = new Object();

    public static void main(String[] args) {
        TR1 T1 = new TR1();
        TR2 T2 = new TR2();

        T1.start();
        T2.start();
    }
}

class TR1 extends Thread {

    @Override
    public void run() {
        System.out.println("TR1: [Try to catch LOCK_1_Monitor]");
        synchronized (ME4.LOCK_1) {
            System.out.println("TR1: [Caught LOCK_1_Monitor]");
            System.out.println("TR1: [Try to catch LOCK_2_Monitor]");
            synchronized (ME4.LOCK_2) {
                System.out.println("TR1: ***[Caught LOCK_1_AND_LOCK_2_Monitor]***");
            }
        }
    }
}

class TR2 extends Thread {

    @Override
    public void run() {
        System.out.println("TR2: [Try to catch LOCK_2_Monitor]");
        synchronized (ME4.LOCK_2) {
            System.out.println("TR2: [Caught LOCK_2_Monitor]");
            System.out.println("TR2: [Try to catch LOCK_1_Monitor]");
            synchronized (ME4.LOCK_1) {
                System.out.println("TR2: ***[Caught LOCK_2_AND_LOCK_1_Monitor]***");
            }
        }
    }
}
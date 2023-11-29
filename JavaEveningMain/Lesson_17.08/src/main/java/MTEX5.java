public class MTEX5 {
    public static void main(String[] args) {
        MT11 T1 = new MT11();
//        T1.setName("THREAD: 1");
//        T1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("NAME: " + T1.getName());
        System.out.println("PRIORITY: " + T1.getPriority());
    }

}


class MT11 extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 50; i++) {
            System.out.println("UP: " + i);
        }
    }
}

class MT22 implements Runnable {

    @Override
    public void run() {
        for (int i = 50; i > 0; i--) {
            System.out.println("DOWN: " + i);
        }
    }
}
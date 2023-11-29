public class MTE5 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        TR tr = new TR();

        tr.setName("TREAD TR");
        tr.setPriority(Thread.MAX_PRIORITY);
        tr.start();
        System.out.println("NAME: " + tr.getName());
    }
}

class TR extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 110; i++) {
            System.out.println("TR: " + i);
        }
    }
}
public class MT9 extends Thread {
    boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Counter: " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        MT9 mt9 = new MT9();
        mt9.start();
        Thread.sleep(1500);
        System.out.println("Wake UP NEO!");
        mt9.b = false;
        mt9.join();
        System.out.println("Main End");
    }
}

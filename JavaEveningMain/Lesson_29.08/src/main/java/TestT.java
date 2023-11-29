public class TestT {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("MAIN START");

        IN in = new IN();
        in.start();

        Thread.sleep(1500);
        in.interrupt();

        in.join();
        System.out.println("MAIN END");
    }
}

class IN extends Thread {
    @Override
    public void run() {
        for (int i = '!'; i < '}'; i++) {
            System.out.println("[" + isInterrupted() + "]");
            if (isInterrupted()) {
                System.out.println("IS INTERRUPTED");
                return;
            }
            System.out.println("CHAR: " + (char) i);
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                System.out.println("[ InterruptedException ]");
                return;
            }
        }
    }
}
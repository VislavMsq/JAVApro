public class Inter {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("MAIN START");
        IThread thread = new IThread();

        thread.start();
        Thread.sleep(1500);

        thread.interrupt();
        thread.join();
        System.out.println("MAIN END");
    }
}

class IThread extends Thread {
    double d = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            if (isInterrupted()) {
                System.out.println("Поток хотят прервать === " + i);
                return;
            }
            d += Math.sqrt(i);
            try {
                Thread.sleep(300);
                System.out.println("28. " + isInterrupted());
                System.out.println(isInterrupted());
            } catch (InterruptedException e) {
                System.out.println("30. " + isInterrupted());
                System.out.println("Поток хотят прервать  -> завершаем его работу === " + i);
                interrupt();
                System.out.println("33. " + isInterrupted());
            }
        }
        System.out.println("SQRT: " + d);
    }
}

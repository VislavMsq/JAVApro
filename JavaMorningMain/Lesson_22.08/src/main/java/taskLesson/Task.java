package taskLesson;

public class Task {
    public static void main(String[] args) throws InterruptedException {
        Counter c1 = new Counter(0, 2500);
        Counter c2 = new Counter(2501, 5000);
        Counter c3 = new Counter(5001, 7500);
        Counter c4 = new Counter(7501, 10000);

        Thread thread = new Thread(c1);
        Thread thread2 = new Thread(c2);
        Thread thread3 = new Thread(c3);
        Thread thread4 = new Thread(c4);

        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();

        thread.join();
        thread2.join();
        thread3.join();
        thread4.join();

        int sum = c1.sum + c2.sum + c3.sum + c4.sum;
        System.out.println(sum);
    }
}

class Counter implements Runnable {
    private int start = 0;
    private int end = 0;
    int sum = 0;

    public Counter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }
}


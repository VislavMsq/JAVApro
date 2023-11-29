package task;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        First first = new First();
        Second second = new Second();

        Thread t1 = new Thread(first);
        Thread t2 = new Thread(second);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        int a = first.sumFirst + second.sumSecond;
        System.out.println(a);
    }

}

class First extends Thread {
    int sumFirst = 0;

    @Override
    public void run() {
        for (int i = 1; i < 501; i++) {
            sumFirst += i;
        }
    }
}

class Second extends Thread {
    int sumSecond = 0;

    @Override
    public void run() {
        for (int i = 501; i < 1001; i++) {
            sumSecond += i;
        }
    }
}
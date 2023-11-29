public class ME3 {
    private static final Object lock = new Object(); // заглушка

    public static void main(String[] args) {
        Thread t1 = new Thread(new Mob());
        Thread t2 = new Thread(new Skype());
        Thread t3 = new Thread(new Tel());

        t1.start();
        t2.start();
        t3.start();
    }

    void mobCall() throws InterruptedException {
        synchronized (lock) {
            System.out.println("Mob call start!");
            Thread.sleep(2200);
            System.out.println("Mob call end");
        }

    }

    void skypeCall() throws InterruptedException {
        synchronized (lock) {
            System.out.println("Skype call start!");
            Thread.sleep(2800);
            System.out.println("Skype call end");
        }
    }

    void telCall() throws InterruptedException {
        synchronized (lock) {
            System.out.println("Tel call start!");
            Thread.sleep(3500);
            System.out.println("Tel call end");
        }
    }
}

class Mob implements Runnable {

    @Override
    public void run() {
        try {
            new ME3().mobCall();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Skype implements Runnable {

    @Override
    public void run() {
        try {
            new ME3().skypeCall();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Tel implements Runnable {

    @Override
    public void run() {
        try {
            new ME3().telCall();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
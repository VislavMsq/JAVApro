public class ME5 {
    public static void main(String[] args) {
        SuperMarket superMarket = new SuperMarket();
        Producer producer = new Producer(superMarket);
        Consumer consumer = new Consumer(superMarket);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();
    }
}

class SuperMarket {
    private int breadCount = 0;
    private final static Object LOCK = new Object(); //todo

    public void getBread() throws InterruptedException {
        synchronized (SuperMarket.LOCK) {
            while (breadCount < 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            Thread.sleep(800);
            breadCount--;
            System.out.println("Покупатели купили 1 булочку");
            System.out.println("Колличество булочек  в магазине: " + breadCount);
            notify();
        }
    }

    public void putBread() throws InterruptedException {
        synchronized (SuperMarket.LOCK) {
            while (breadCount >= 10) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            Thread.sleep(800);
            breadCount++;
            System.out.println("Фабрика отвезла 1 булочку в магазин");
            System.out.println("Колличество булочек в магазине: " + breadCount);
            notify();
        }
    }
}

class Producer implements Runnable {
    SuperMarket superMarket;

    public Producer(SuperMarket superMarket) {
        this.superMarket = superMarket;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                superMarket.putBread();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements Runnable {
    SuperMarket superMarket;

    public Consumer(SuperMarket superMarket) {
        this.superMarket = superMarket;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                superMarket.getBread();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
import java.util.concurrent.Semaphore;

public class SEM {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        new Person("Anna",semaphore);
        new Person("Nam",semaphore);
        new Person("Egor",semaphore);
        new Person("Said",semaphore);
        new Person("Matis",semaphore);
    }
}

class Person extends Thread {
    String name;
    private Semaphore semaphore;

    public Person(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
        this.setName("T: " + name);
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " before");
            semaphore.acquire();
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " after");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
            System.out.println(Thread.currentThread().getName() + " is OUT");
        }
    }
}
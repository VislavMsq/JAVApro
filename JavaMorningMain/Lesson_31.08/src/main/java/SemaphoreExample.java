import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        new Emp("Paul",semaphore);
        new Emp("Vlad",semaphore);
        new Emp("Oksana",semaphore);
        new Emp("Maria",semaphore);
        new Emp("Lera",semaphore);
        new Emp("Vitalii",semaphore);
        new Emp("Vladislav",semaphore);
        new Emp("Michail",semaphore);
        new Emp("Mik",semaphore);
        new Emp("Julia",semaphore);
    }
}

class Emp extends Thread {
    String name;
    private Semaphore semaphore;

    public Emp(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
        this.setName("THREAD ----- " + name);
        this.start();
    }

    @Override
    public void run() {
        try {
            semaphore.acquire(1);
            Thread.sleep(3000);
            System.out.println(name + " is waiting for .... ||||" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release(2);
        }
    }
}

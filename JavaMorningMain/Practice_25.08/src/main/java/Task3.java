import java.util.concurrent.CountDownLatch;

public class Task3 {
    /*
        // Задача 3:
    // Рассмотрим такой код:
    // Thread t = new Thread(() -> {
    //     System.out.println("Another thread");
    // });

    // t.start(); до start тоже ничего нельзя писать
    // System.out.println("Main thread");
    // t.join();

    // Как можно его изменить таким образом, чтобы гарантированно выводить сообщение на печать из потока до того,
    // как будет напечатано сообщение из Main треда? Операцию "t.join()" нельзя переносить куда-либо.
     */
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Thread t = new Thread(() -> {
            System.out.println("Another thread");
            countDownLatch.countDown();

        });

        t.start();
        System.out.println("Main thread");
        t.join();
    }
}

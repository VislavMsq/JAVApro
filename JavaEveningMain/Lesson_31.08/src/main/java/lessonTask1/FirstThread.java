package lessonTask1;

import java.util.concurrent.Exchanger;

public class FirstThread extends Thread {
    private Exchanger<String> exchanger;

    public FirstThread(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        this.start();
    }

    @Override
    public void run() {
        String str = "Привет, второй поток!";
        System.out.println(str);
        try {
            String s = exchanger.exchange(str);
            System.out.println("Первый поток встретил --> " + s);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

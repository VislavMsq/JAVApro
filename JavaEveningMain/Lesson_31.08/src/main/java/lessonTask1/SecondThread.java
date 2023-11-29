package lessonTask1;

import java.util.concurrent.Exchanger;

public class SecondThread extends Thread{
    private Exchanger<String> exchanger;

    public SecondThread(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        this.start();
    }

    @Override
    public void run() {
        String str = "Привет, первый поток!";
        System.out.println(str);
        try {
            String s = exchanger.exchange(str);
            System.out.println("Второй поток встретил --> " + s);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

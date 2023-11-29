package lessonTask1;

import java.util.concurrent.Exchanger;

public class MessageExchange {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        Thread firstThread = new Thread(new FirstThread(exchanger));
        Thread secondThread = new Thread(new SecondThread(exchanger));

        firstThread.start();
        secondThread.start();
    }
}
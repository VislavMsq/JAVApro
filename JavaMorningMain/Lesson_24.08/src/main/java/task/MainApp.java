package src.main.java.task;

public class MainApp {
    public static void main(String[] args) {
        Sender sender = new Sender();
        Receiver receiver = new Receiver();

        Thread senderThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sender.sendData(i);
                receiver.receiveData(sender.getDataToSend());
                System.out.println(Thread.currentThread().getName() + " отправил данные от отправителя к получателю" + i);
            }
        });
        Thread receiverThread = new Thread(() -> {
            for (int i = 5; i > 0; i--) {
                sender.sendData(i);
                receiver.receiveData(sender.getDataToSend());
                System.out.println(Thread.currentThread().getName() + " отправил данные от отправителя к получателю" + i);
            }
        });
        Thread mainThread = new Thread(() -> {
            System.out.println(receiver.getReceivedData() + " выводим принятые данные в главный поток");
        });
        senderThread.setName("T1");
        receiverThread.setName("T2");
        mainThread.setName("T3");

        senderThread.start();
        receiverThread.start();
        mainThread.start();

        try {
            senderThread.join();
            receiverThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

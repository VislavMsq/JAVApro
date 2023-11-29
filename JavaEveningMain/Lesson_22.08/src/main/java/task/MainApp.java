package task;

public class MainApp {

    public static void waitTime(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        Sender sender = new Sender();
        Receiver receiver = new Receiver();

        Thread senderT = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                sender.sendData(i);
                receiver.receiveData(sender.getDataToSend());
            }
        });
        Thread receiverT = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                receiver.receiveData(i);
                sender.sendData(receiver.getReceivedData());
            }
        });
        Thread mainT = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println(receiver.getReceivedData());
                System.out.println(sender.getDataToSend());
            }
        });

        senderT.setName("sender-thread");
        senderT.start();

        receiverT.setName("receiver-thread");
        receiverT.start();


        mainT.start();
    }
}


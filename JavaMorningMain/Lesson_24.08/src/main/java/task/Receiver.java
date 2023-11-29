package src.main.java.task;

public class Receiver {
    private volatile int receivedData;

    public synchronized int receiveData(int data) {
        return receivedData = data;
    }

    public synchronized int getReceivedData() {
        return receivedData;
    }


}

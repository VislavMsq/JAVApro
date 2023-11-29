package src.main.java.task;

public class Sender{
    private volatile int dataToSend;

    public synchronized int sendData (int data) {
        return dataToSend = data;
    }

    public synchronized int getDataToSend() {
        return dataToSend;
    }

}

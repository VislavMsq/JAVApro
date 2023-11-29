package task;

import lombok.Getter;

@Getter
public class Receiver {
    private volatile int receivedData;

    public synchronized void receiveData(int data) {
        receivedData = data;
        System.out.println(Thread.currentThread().getName()+ " receiver set data: " + data);
    }

    public synchronized int getReceivedData() {
        return receivedData;
    }
}

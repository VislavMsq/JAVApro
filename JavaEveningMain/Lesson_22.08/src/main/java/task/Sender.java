package task;

import lombok.Getter;

@Getter
public class Sender {
    private volatile int dataToSend;

    public synchronized void sendData(int data) {
        dataToSend = data;
        System.out.println(Thread.currentThread().getName()+ " sender set data: " + data);
    }

    public synchronized int getDataToSend() {
        return dataToSend;
    }
}

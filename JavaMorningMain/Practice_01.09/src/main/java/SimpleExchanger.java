public class SimpleExchanger<T> {
    private T message;

    public T exchange(T msg) {
        synchronized (this) {
            if (message == null) {
                message = msg;
                try {
                    wait();
                    return message;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                T tmp = message;
                message = msg;
                notifyAll();
                return tmp;
            }
        }
    }
}

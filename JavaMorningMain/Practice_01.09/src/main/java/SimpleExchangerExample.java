public class SimpleExchangerExample {
    public static void main(String[] args) {
        SimpleExchanger<String> simpleExchanger = new SimpleExchanger<>();

        Thread thread1 = new Thread(() -> {
            System.out.println("T1: " + simpleExchanger.exchange("Msg 1"));
        });

        thread1.start();

        Thread thread2 = new Thread(() -> {
            System.out.println("T2: " + simpleExchanger.exchange("Msg 2"));
        });

        thread2.start();
    }
}


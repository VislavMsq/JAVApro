public class Lesson {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();

        t1.start();
        t2.start();
    }
}


class T1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 400; i++) {
            System.out.println("UP: " + i);
        }
    }
}

class T2 extends Thread {
    @Override
    public void run() {
        for (int i = 399; i > 0; i--) {
            System.out.println("DOWN: " + i);
        }
    }
}


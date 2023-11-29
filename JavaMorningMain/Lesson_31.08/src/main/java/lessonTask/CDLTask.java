package lessonTask;

import java.util.concurrent.CountDownLatch;

public class CDLTask {

    static class Participant extends Thread {
        private final String name;
        private final CountDownLatch startSignal;

        public Participant(String name, CountDownLatch startSignal) {
            this.name = name;
            this.startSignal = startSignal;
        }

        @Override
        public void run() {
            System.out.println(name + " готовится");
            try {
                startSignal.await(); // Ожидание сигнала старта
                System.out.println(name + " стартовал!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Race {
        public static void main(String[] args) {
            int participantCount = 5;
            CountDownLatch startSignal = new CountDownLatch(1);

            Participant[] participants = new Participant[participantCount];
            for (int i = 0; i < participantCount; i++) {
                participants[i] = new Participant("Участник " + (i + 1), startSignal);
                participants[i].start();
            }

            System.out.println("Подготовка к старту...");
            startSignal.countDown();

            try {
                for (Participant participant : participants) {
                    Thread.sleep(500);
                    participant.join();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Соревнование завершено!");
        }
    }
}


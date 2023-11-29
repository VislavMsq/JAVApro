import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Random random = new Random();
        Exchanger<Digit> exchanger = new Exchanger<>();
        List<Digit> p1dl = new ArrayList<>();
        List<Digit> p2dl = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            p1dl.add(new Digit(random.nextInt(5)));
            p2dl.add(new Digit(random.nextInt(5)));
        }

        System.out.println(p1dl);
        System.out.println(p2dl);
        new Player("Bogdan", p1dl, exchanger);
        new Player("Vladislav", p1dl, exchanger);
    }
}


class Digit {
    private int random;

    public int getRandom() {
        return random;
    }

    @Override
    public String toString() {
        return " || " + random;
    }

    public Digit(int random) {
        this.random = random;
    }
}

class Player extends Thread {
    private String name;
    private List<Digit> digitList;
    private Exchanger<Digit> exchanger;

    private int counter;

    public Player(String name, List<Digit> digitList, Exchanger<Digit> exchanger) {
        this.name = name;
        this.digitList = digitList;
        this.exchanger = exchanger;
        this.start();
    }

    private void play(Digit p1d, Digit p2d) {
        if (p1d.getRandom() > p2d.getRandom()) {
            System.out.println(name + " : WINNER");
        } else if (p1d.getRandom() < p2d.getRandom()) {
            System.out.println(name + " : WINNER");
        } else {
            System.out.println("DRAW");
        }
    }

    @Override
    public void run() {
        Digit reply;
        for (Digit digit : digitList) {
            try {
                reply = exchanger.exchange(digit);
                play(digit, reply);
                Thread.sleep(888);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
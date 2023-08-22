package multithreading;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Task {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        EBoy1 eBoy1 = new EBoy1(intList, 0, intList.size() / 2);
        EBoy1 eBoy2 = new EBoy1(intList, intList.size() / 2, intList.size());

        eBoy1.start();
        eBoy2.start();

        eBoy1.join();
        eBoy2.join();

        System.out.println(eBoy1.sum);
        System.out.println(eBoy2.sum);
        System.out.println(eBoy1.sum + eBoy2.sum);

    }

}

class EBoy1 extends Thread {
    int sum = 0;
    int firstIndex;
    int endIndex;
    List<Integer> integerList;

    public EBoy1(List<Integer> integerList, int firstIndex, int endIndex) {
        this.firstIndex = firstIndex;
        this.endIndex = endIndex;
        this.integerList = integerList;
    }

    @Override
    public void run() {
        for (int i = firstIndex; i < endIndex; i++) {
            sum += integerList.get(i);
        }
    }
}

// given
// when   основа всех тестов, эти три этапа
// then


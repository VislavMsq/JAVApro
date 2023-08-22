package multithreading;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SunTest {
    @Test
    public void sumTest() throws InterruptedException {
        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        EBoy1 eBoy1 = new EBoy1(intList, 0, intList.size() / 2);
        EBoy1 eBoy2 = new EBoy1(intList, intList.size() / 2, intList.size());

        eBoy1.start();
        eBoy2.start();

        eBoy1.join();
        eBoy2.join();

        // ------------

        int a = 5;
        int b = 7;


        //System.out.println(eBoy1.sum);
        //System.out.println(eBoy2.sum);
        //System.out.println(eBoy1.sum + eBoy2.sum);

        // ((n0 + nLast) * nLen) / 2

        int result = ((intList.get(0) + intList.get(intList.size() - 1)) * intList.size()) / 2;

        Assert.assertEquals(result, eBoy1.sum + eBoy2.sum);
    }
}

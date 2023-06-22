package task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IBAN {

    private String iban;

    public IBAN() {
        Random random = new Random();
        for (int i = 0; i < 12; i++) {
            Integer num = random.nextInt(9);
            this.iban += num.toString();
        }
//        this.iban = iban;
    }

    @Override
    public String toString() {
        return iban + "";
    }
}

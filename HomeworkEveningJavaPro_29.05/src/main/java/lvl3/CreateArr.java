package lvl3;

import java.util.ArrayList;

public class CreateArr {
    public static void random(){
        ArrayList<Integer> list = new ArrayList<>();
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(20));
        }
    }
}

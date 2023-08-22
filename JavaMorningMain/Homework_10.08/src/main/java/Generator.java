import com.github.javafaker.Faker;

import java.util.Random;

public class Generator {
    public static int generateID() {
        return new Random().nextInt(10000, 100000);
    }

    public static String generateMail() {
        return new Faker().internet().emailAddress();
    }
//    public static String generatePass() {
//        return new Faker().internet().password();
//    }
}

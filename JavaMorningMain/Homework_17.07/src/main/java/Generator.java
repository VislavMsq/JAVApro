import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

public class Generator {

    private static String[] generateName() {
        Faker faker = new Faker(new Locale("uk-UA"));
        return new String[]{faker.name().firstName(), faker.name().lastName()};
    }

    public static BankCard generateBankCard() {
        Random random = new Random();
        StringBuilder stringNumber = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            stringNumber.append(random.nextInt(1, 10));
        }
        StringBuilder stringCVV = new StringBuilder(
                Integer.toString(random.nextInt(1, 10)) +
                        Integer.toString(random.nextInt(1, 10)) +
                        Integer.toString(random.nextInt(1, 10)));

        String stringDate = String.format("%02d%02d",
                random.nextInt(1, 13),
                random.nextInt(21, 31));

        int index = random.nextInt(Status.values().length);
        Status status = Status.values()[index];


        return new BankCard("USD", status, stringNumber.toString(), stringDate, stringCVV.toString());
    }

    public static Client generateClient() {
        String[] fullName = generateName();
        return new Client(fullName[0], fullName[1], new Random().nextInt(0, 20_000), generateBankCard());
    }
}

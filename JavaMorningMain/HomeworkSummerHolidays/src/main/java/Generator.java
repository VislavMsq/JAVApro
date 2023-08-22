import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class Generator {

    public static String[] generateName() {
        Faker faker = new Faker(new Locale("en-US"));
        return new String[]{faker.name().firstName(), faker.name().lastName()};
    }

    public static char getGender(String name) {
        if (Character.toString(name.charAt(name.length() - 1)).matches(".*[aeu]$"))
            return 'F';
        return 'M';
    }

    public static Car generateAuto() {
        Random random = new Random();
        int num = random.nextInt(Color.values().length);
        Color color = Color.values()[num];

        int rm = random.nextInt(1, 11);
        num = random.nextInt(BrandAuto.values().length);
        BrandAuto brandAuto = BrandAuto.values()[num];

        boolean isSport = rm > 6;
        int maxSpeed = isSport ? random.nextInt(220, 361) : random.nextInt(160, 221);

        return new Car(color, maxSpeed, isSport, brandAuto);
    }

    public static List<Developer> generateDeveloper(int count) {
        if (count <= 0) {
            throw new IllegalArgumentException();
        }
        List<Developer> developers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String[] name = generateName(); // name [0] [1]
            boolean add = developers.add(new Developer(
                    name[0],
                    name[1],
                    new Random().nextInt(5000, 30001),
                    getGender(name[0]),
                    generateAuto()
            ));
        }
        return developers;
    }
}

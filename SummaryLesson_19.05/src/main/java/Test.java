import javax.sound.midi.Soundbank;

public class Test {

    private Day day = Day.MONDAY;

    public static void main(String[] args) {

        Day today = Day.WEDNESDAY;

        Day[] days = Day.values();
        for (int i = 0; i < days.length; i++) {
            if (days[i] == today) {
                System.out.println("Today is " + today);
            }
        }
        System.out.printf("Day %s has index %d\n", today, today.ordinal());

        if (Day.valueOf("FRIDAY") == Day.FRIDAY){
            System.out.println("It is Friday");
        }
        System.out.println(Day.valueOf("MONDAY").getOrdinal());

        Operation op = Operation.PLUS;
        System.out.println(op.apply(1, 2));
    }

    public void printDay() {
        switch (day) {
            case MONDAY:
                System.out.println("Today is Monday");
                break;
            case TUESDAY:
                System.out.println("Today is Tuesday");
                break;
        }
    }

    public Day getDay() {
        return day;
    }

    public enum Day {

        MONDAY(1),
        TUESDAY(2),
        WEDNESDAY(3),
        THURSDAY(4),
        FRIDAY(5),
        SATURDAY(6),
        SUNDAY(7);

        private final int ordinal;

         Day(int ordinal){
            this.ordinal = ordinal;
        }

        public int getOrdinal() {
            return ordinal;
        }
    }
}
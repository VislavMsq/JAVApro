import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainMain {
    public static void main(String[] args) {

        List<Client> list = new ArrayList<>();

        for (int i = 0; i < 25; i++) {
            list.add(Generator.generateClient());
        }

        Storage storage = new Storage(list);

//        System.out.println(storage.getClientIntegerMap());
//        System.out.println(Generator.generateBankCard());
//        System.out.println(storage.statusCard(Status.GOLD));
//        System.out.println(storage.showEndDateCard());
//        System.out.println(storage.sortBalance());
        Map<Boolean, List<Client>> map = storage.groupByDateCard();
        System.out.println(map);
    }
}

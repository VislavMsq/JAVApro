import java.util.Date;
import java.util.List;

public class ThreadTest {
    public static void main(String[] args) {
        Date date1 = new Date();
        List<Factory> factoryList1 = Parser.parsElements1("textPars.txt");

        Date dateEnd1 = new Date();
        System.out.println(dateEnd1.getTime() - date1.getTime());

        System.out.println(factoryList1.size());

//        Date date2 = new Date();
//        List<Factory> factoryList2 = Parser.parsElements("textPars.txt");

//        Date dateEnd2 = new Date();
//        System.out.println(dateEnd2.getTime() - date2.getTime());
    }
}

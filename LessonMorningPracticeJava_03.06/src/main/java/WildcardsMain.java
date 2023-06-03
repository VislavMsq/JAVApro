import java.util.ArrayList;
import java.util.List;

public class WildcardsMain {
    public static void main(String[] args) {

        List<Integer> listOfInts = List.of(1, 2, 3, 4, 5);
// мы можем присвоить любой сюда любой лист в Number или его потомков
        List<? extends Number> listExtends = listOfInts;

        Number number = listExtends.get(0);
        listExtends.add(10);

        System.out.println();
    }
}

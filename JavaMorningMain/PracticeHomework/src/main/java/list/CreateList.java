package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CreateList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        String[] arr = {"one", "two", "three"};
        List<String> array = Arrays.asList(arr);
        System.out.println(array);

        List<String> arr2 = List.of("One","Two","Three");
    }
}

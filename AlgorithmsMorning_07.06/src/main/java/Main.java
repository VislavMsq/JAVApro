import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {9, 2, 5, 6, 1, 9, 0, 2, 9, 4, 5, 1, 6, 9, 8, 10};

        System.out.println(Arrays.toString(findIndexes(array,9)));
    }

    public static int[] findIndexes(int[] arr,int number){
        int [] newArray = new int[arr.length];
        Arrays.fill(newArray, -1);
        int j =0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==number){
                newArray[j] = i;
                j++;
            }
        }
        return newArray;
    }
}

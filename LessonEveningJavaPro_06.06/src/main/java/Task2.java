import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static boolean isPalindrome(String str){
         return new StringBuilder(str).reverse().toString().equals(str);
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.reverse();
//        boolean stringTrue = false;
//        if(stringBuilder.toString().equals(str)){
//            stringTrue = true;
//        }
//        return stringTrue;
    }


    public static void main(String[] args) {
        String s = new String("madam");
        System.out.println(isPalindrome(s));
    }
}

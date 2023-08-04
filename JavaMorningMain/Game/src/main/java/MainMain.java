import com.github.javafaker.Faker;
import com.github.javafaker.Food;

public class MainMain {
    public static void main(String[] args) {
        Word word = new Word("баггет");
        System.out.println(word);
        word.checkerWord("болото");

        System.out.println(word);
    }
}

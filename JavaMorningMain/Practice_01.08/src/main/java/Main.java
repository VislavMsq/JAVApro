import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String regex = "[A-Z][a-z]*\\s*[A-Z][a-z]*"; // Шаблон для имени
                                                   // [A-Z]{1} - большая буква представлена один раз
                                                   // [*a-z]{0,} - маленькая буква представлена произвольное кл-во раз
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(regex);     // проверяем регулярное выражение
        Matcher matcher;                              // ссылка на обьект
        System.out.println("Введите имя:");
        String str = scanner.nextLine();              // получаем строку
        matcher = pattern.matcher(str);               // передаем строку, по которой будем проверять в обьект matcher
        System.out.println(matcher.matches());        // выводим результат





    }
}

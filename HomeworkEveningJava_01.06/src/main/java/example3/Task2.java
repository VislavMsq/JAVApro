package example3;

import java.util.HashSet;
import java.util.Set;

public class Task2 {
    /*
    Напишите класс Book, который имеет следующие поля:

    title (тип String) - название книги;
    author (тип String) - автор книги;
    publicationYear (тип int) - год публикации.

    Реализуйте интерфейс Comparable для класса Book, чтобы объекты Book могли быть сравниваемыми
    на основе года публикации. При сравнении двух объектов Book должно возвращаться отрицательное число,
    если первая книга была опубликована раньше второй, положительное число, если первая книга была опубликована
    позже второй, и ноль, если книги были опубликованы в один и тот же год.
     */
    public static void main(String[] args) {
        Set<Book> books = new HashSet<>();
        Book book = new Book("Stephen King","Carrie",1974);
        Book book2 = new Book("Stephen King","It",1986);
        Book book3 = new Book("Stephen King","11/22/63",2011);

        books.add(book);
        books.add(book2);
        books.add(book3);

        System.out.println(book3.compareTo(book2));
    }
}

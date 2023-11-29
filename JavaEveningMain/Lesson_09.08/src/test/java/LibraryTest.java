import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    private final Library library = new Library();

    @Test
    void addBook() {

    }

    @Test
    void removeBook() {
        Book book = new Book("Грокаем Алгоритмы", "Адитья Бхаргава", 2017);
        library.removeBook(book);

    }

//    @Test
//    void searchByAuthor() {
//        List<Book> books = library.searchByAuthor("Адитья Бхаргава");
//        library.addBook(new Book("Грокаем Алгоритмы", "Адитья Бхаргава", 2017));
//        library.addBook(new Book("Java: руководство для начинающих", "Герберт Шилдт", 2019));
//
//        Assert.assertEquals(2,books.size());

//    }

    @Test
    void searchByTitle() {
    }

    @Test
    void searchByYear() {
    }
}


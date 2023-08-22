import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    private final Library library = new Library();

    @BeforeEach
    void setLibrary() {
        library.clearBooks();   // каждый раз очищаем лист
        library.addBook(new Book("A", "Vlad", 1917));
        library.addBook(new Book("B", "John", 1997));
        library.addBook(new Book("С", "John", 2003));
        library.addBook(new Book("Bible", "Luca", 24));
    }

    @Test
    void addBookTest() {
        int size = 5;
        library.addBook(Mockito.mock(Book.class));
        Assertions.assertEquals(size, library.bookSize());
    }

    @Test
    void addNullBookTest() {
        Assertions.assertThrows(NullPointerException.class, () -> library.addBook(null));
    }

    @Test
    void removeBookTest() {
        int size = 3;
        library.removeBook(library.searchByAuthor("Anton").get(0));
        Assertions.assertEquals(size, library.bookSize());
    }

    @Test
    void removeNoneBookTest() {
        int size = 4;
        library.removeBook(new Book("A", "Eugene", 1234));
        Assertions.assertEquals(size, library.bookSize());
    }

    @Test
    void removeNullBookTest() {
        Assertions.assertThrows(NullPointerException.class, () -> library.removeBook(null));
    }

    @Test
    void searchByAuthorTest() {
        int size = 2;
        library.searchByAuthor("Vlad");
        Assertions.assertEquals(size, library.searchByAuthor("Vlad").size());
    }

    @Test
    void searchNullByAuthorTest() {
        Assertions.assertThrows(NullPointerException.class, () -> library.searchByAuthor(null));
    }

    @Test
    void searchByTitle() {
    }

    @Test
    void searchByYear() {
    }

    @Test
    void clearBooks() {
    }
}
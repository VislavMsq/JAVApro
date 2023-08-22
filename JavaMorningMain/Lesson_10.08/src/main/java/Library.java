import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Library {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Add book: \"" + book.getTitle() + "\"");
    }

    public void removeBook(Book book) {
        books.remove(book);
        System.out.println("Remove book: \"" + book.getTitle() + "\"");
    }

    public List<Book> searchByAuthor(String author) {
        if (author == null) {
            throw new NullPointerException();
        }
        return books.stream()
                .filter(b -> author.equals(b.getAuthor()))
                .toList();
    }

    public List<Book> searchByTitle(String title) {
        if (title == null) {
            throw new NullPointerException();
        }
        return books.stream()
                .filter(b -> title.equals(b.getTitle()))
                .toList();
    }

    public List<Book> searchByYear(int year) {
        if (year < 0 || year > 2023) {
            throw new IllegalArgumentException();
        }
        return books.stream()
                .filter(b -> b.getYear() == year)
                .toList();
    }

    public void clearBooks() {
        books.clear();
    }

    public int bookSize() {
        return books.size();    }
}

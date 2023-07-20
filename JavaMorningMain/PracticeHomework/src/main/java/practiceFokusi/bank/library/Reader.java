package practiceFokusi.bank.library;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
//@AllArgsConstructor
@ToString
public class Reader {
    private String name;
    private List<Book> orderedBooks;

    public Reader(String name) {
        orderedBooks = new ArrayList<>();
        this.name = name;
    }

    public boolean extradition(Book book) {
        if (!orderedBooks.contains(book)) {
            System.out.println("Reader: " + this.name + " haven't this book -> \"" + book.getTitle() + "\"");
            return false;
        }
        this.orderedBooks.remove(book);
        System.out.println("Reader: " + this.name + " remove book -> " + book.getTitle());
        return true;
    }

    public void addBook(Book book) {
        this.orderedBooks.add(book);
    }
}

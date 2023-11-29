import lombok.Getter;
import lombok.ToString;
import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
class Library {
    private  List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Add book: \"" + book.getTitle() + "\"");
    }

    public void removeBook(Book book) {
        books.remove(book);
        System.out.println("Remove book: \"" + book.getTitle() + "\"");
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> books1 = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                books1.add(book);
                System.out.println("Added book by author");
            }
        }
        if (books1.isEmpty()) {
            System.out.println("No book by this author");
        }
        return books1;
    }

    public List<Book> searchByTitle(String title) {
        List<Book> books2 = new ArrayList<>();
        for (Book book : this.books) {
            if (book.getTitle().equals(title)) {
                books2.add(book);
                System.out.println("Added book by title");
            }
        }
        if (books2.isEmpty()) {
            System.out.println("No book with that title");
        }
        return books2;
    }


    public List<Book> searchByYear(int year) {
        List<Book> books3 = new ArrayList<>();
        for (Book book : this.books) {
            if (book.getYear() == year) {
                books3.add(book);
                System.out.println("Added book by this year");
            }
        }
        if (books3.isEmpty()) {
            System.out.println("No book with that year");
        }
        return books3;
    }
}

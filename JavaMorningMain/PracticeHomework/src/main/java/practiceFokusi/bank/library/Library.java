package practiceFokusi.bank.library;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/*
 Создайте класс "Библиотека" (Library), который имеет поля: список книг (books) и список читателей (readers). Класс
 "Книга" (Book) имеет поля: название (title), автор (author) и доступность (available). Класс "Читатель" (Reader)
 имеет поля: имя (name) и список взятых книг (borrowedBooks). Добавьте методы для добавления книг в библиотеку,
 выдачи книги читателю и возврата книги в библиотеку.
 */
/*
1. Library
    - поля:
        books   -> list
        readers -> list
2. ++Book
    - поля:
        title
        author
        available
3. ++Reader
    - поля:
        name          -> String
        borrowedBooks -> List

    Методы:
        - addBook -> in library
        - extraditionBook -> for reader
        - returnBook -> to library
 */
/*

// (el) -> {el*2}

Шпора
1. Нужно знать,что метод получает
2. Что метод отдает
 */
@ToString
@Getter
@Setter
//@AllArgsConstructor
public class Library {
    private List<Book> bookList;
    private List<Reader> readerList;

    public Library() {
        bookList = new ArrayList<>();
        readerList = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.bookList.add(book);
        System.out.println("Book: \"" + book.getTitle() + "\" was added.");
    }

    public void extraditionBook(Reader reader, Book book) {
        // видять для читача, забрати в бібліотеки
        this.bookList.remove(book);
        System.out.println("Remove book: \"" + book.getTitle() + "\" from library");
        this.readerList.add(reader);
        System.out.println("Add book: \"" + book.getTitle() + "\" to reader: " + reader.getName());

        reader.addBook(book);
    }

    public void returnBook(Reader reader, Book book) {
        if (!reader.extradition(book)) {
            System.out.println("Reader: " + reader.getName() + " don't have a book " + book.getTitle());
            return; // нужен для того, чтобы код завершился - если будет false
        }
        bookList.add(book);
        System.out.println("Reader: " + reader.getName() + " return book to library " + book.getTitle());
    }
}

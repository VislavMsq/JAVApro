package practiceFokusi.bank.library;

import java.util.ArrayList;

public class LibraryTarasaShevchenka {
    public static void main(String[] args) {
        Library tarasaShevchenka = new Library();

        Book k = new Book("Kobzar", "Taras Shevchenko");
        Book l = new Book("Lis Mikita", "Franko");
        Book t = new Book("Tras Bulba", "Gogol");


        tarasaShevchenka.addBook(k);
        tarasaShevchenka.addBook(l);
        tarasaShevchenka.addBook(t);

        Reader reader = new Reader("Bogdan");

        tarasaShevchenka.extraditionBook(reader, l);

//        reader.extradition(k);
//        reader.extradition(l);

        tarasaShevchenka.returnBook(reader, l);


    }
}

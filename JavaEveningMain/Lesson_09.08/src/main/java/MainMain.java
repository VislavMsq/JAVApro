public class MainMain {
    public static void main(String[] args) {
        Book book = new Book("Грокаем Алгоритмы", "Адитья Бхаргава", 2017);
        Book book2 = new Book("Java: руководство для начинающих", " Герберт Шилдт", 2019);
        Library library = new Library();
        library.addBook(book);
        library.removeBook(book);

        library.addBook(book2);
        library.searchByAuthor("Герберт Шилдт");
        library.searchByTitle("Грокаем Алгоритмы");
        library.searchByYear(2017);
    }
}

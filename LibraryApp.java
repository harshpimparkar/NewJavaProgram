
//This works as user interface


import java.util.ArrayList;

public class LibraryApp {


    private BookRepository bookRepo = new BookRepository();

    public void searchByIsbn(String isbn) {
        System.out.printf("Finding book with the isbn %s\n\n", isbn);
        Book book = bookRepo.findByIsbn(isbn);
        if (book != null) {
            System.out.printf("ISBN: %s \n TITLE: %S \n AUTHOR: %s \n GENRE: %s \n", book.getIsbn(), book.getTitle(), book.getAuthor(), book.getGenre());
        } else {
            System.out.println("Sorry no books were found :(");
        }
    }

    public void searchByTitle(String keyword) {
        System.out.printf("Finding books with %s \n\n", keyword);
        ArrayList<Book> books = bookRepo.findByTitle(keyword);
        for (Book book : books) {

            System.out.printf("ISBN: %s \n TITLE: %S \n AUTHOR: %s \n GENRE: %s \n", book.getIsbn(), book.getTitle(), book.getAuthor(), book.getGenre());

        }

        System.out.println("\n\n");
    }

    public void searchByAuthor(String author) {
        System.out.printf("Finding book with the author %s\n\n", author);
        Book book = bookRepo.findByAuthor(author);

            System.out.printf("ISBN: %s \n TITLE: %S \n AUTHOR: %s \n GENRE: %s \n", book.getIsbn(), book.getTitle(), book.getAuthor(), book.getGenre());

    }


}
//Individual book and attributes
public class Book {
    private String isbn;
    private String title;
    private String author;
    private String genre;


    //whenever an object is created, field values and parameter are synced by this constructor
    public Book(String isbn, String title, String author, String genre) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.genre = genre;

    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }
}

    //getter function is required to provide access to the methods in book repository which do the
    //finding job



import java.util.ArrayList;

public class BookRepository {

    //object of the type arraylist
    private ArrayList<Book> books = new ArrayList<>();

    public BookRepository(){
        books.add(new Book("10","The Castle by the lake","J.Hanwell","Fiction"));
        books.add(new Book("11"," Castle of King Arther","Harold Larson","Fiction"));
        books.add(new Book("18","Tripwire","William Jesse","Psychological"));
        books.add(new Book("13","Spider-man Vol.1","Stan-lee","Comic"));
    }
    public Book findByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
      return null;
    }

    public ArrayList findByTitle(String keyword){
        ArrayList<Book> booksfound = new ArrayList<>();
        for(Book book: books){
            if(book.getTitle().toLowerCase().contains(keyword)){
                booksfound.add(book);

            }
        }
        return booksfound;
    }

    public Book findByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                return book;
            }
        }
        return null;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryApp app = new LibraryApp();
        Scanner scanner = new Scanner(System.in);

       System.out.println("What do you want to search ?: Title/ISBN/Author/Genre ");

        String search = scanner.next();
        if(search.equals("Title")){
            System.out.println("Enter the keyword :");
            String input = scanner.next();
            app.searchByTitle(input);


        } else if (search.equals("ISBN")) {
            System.out.println("Enter the ISBN :");
            String input = scanner.next();
            app.searchByIsbn(input);


        } else if (search.equals("Author")) {
            System.out.println("Enter the Author :");
            String input = scanner.next();
            app.searchByIsbn(input);


        }//else if (search.equals("Genre")) {

        //}



    }

}

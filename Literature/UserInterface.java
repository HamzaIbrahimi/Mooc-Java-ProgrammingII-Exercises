import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class UserInterface {
    private List<Book> bookLibrary;
    private Scanner scanner;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.bookLibrary = new ArrayList<>();
    }

    public List<Book> getBookLibrary() {
        return bookLibrary;
    }

    public void add(Book book) {
        this.bookLibrary.add(book);
    }

    public void getInput() {
        int count = 0;
        while (true) {
            System.out.println("Input the name of the book, empty stops");
            String title = scanner.nextLine();
            count++;
            System.out.println("Input the age recommendation");
            String recommendedAge = scanner.nextLine();
            if (title.isEmpty() || recommendedAge.isEmpty()) {
                break;
            }
            this.bookLibrary.add(new Book(title, Integer.valueOf(recommendedAge)));
        }
        System.out.println(count + " books in total");
    }

    public void printBooks() {
        this.bookLibrary
                .forEach(System.out::println);
    }
}
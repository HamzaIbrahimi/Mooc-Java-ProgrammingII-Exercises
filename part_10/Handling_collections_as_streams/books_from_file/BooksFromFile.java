import java.util.List;
import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BooksFromFile {
    public static List<Book> readBooks(String file) {
        List<Book> myBooks = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .map(data -> new Book(data[0], Integer.valueOf(data[1]), Integer.valueOf(data[2]), data[3]))
                    .forEach(book -> myBooks.add(book));
        } catch (Exception e) {
            System.out.println(e);
        }
        return myBooks;
    }

    public static void main(String[] args) {
        List<Book> myBooks = readBooks("file.txt");
        myBooks.forEach(System.out::println);
    }

}
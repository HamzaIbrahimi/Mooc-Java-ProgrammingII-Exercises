import java.util.List;
import java.util.Comparator;

public class ListSorter {

    public void printBookBasedOnAge(List<Book> books) {
        books.stream()
                .sorted((a, b) -> a.getRecommendedAge() - b.getRecommendedAge())
                .forEach(System.out::println);
    }

    public void printBooksBasedOnAgeAndName(List<Book> books) {
        Comparator<Book> comparator = Comparator
                .comparing(Book::getRecommendedAge)
                .thenComparing(Book::getTitle);

        books.stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }

}
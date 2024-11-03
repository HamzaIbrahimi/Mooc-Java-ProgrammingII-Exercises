public class Book implements Packable {

    private String author;
    private String titleOfBook;
    private double weightOfBook;

    public Book(String author, String titleOfBook, double weightOfBook) {
        this.author = author;
        this.titleOfBook = titleOfBook;
        this.weightOfBook = weightOfBook;
    }

    public double weight() {
        return this.weightOfBook;
    }

    @Override
    public String toString() {
        return this.author + ": " + this.titleOfBook;
    }
}

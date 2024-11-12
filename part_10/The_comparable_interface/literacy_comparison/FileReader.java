import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    private String file;
    private List<String> rows;

    public FileReader(String file) {
        this.file = file;
        this.rows = new ArrayList<>();
    }

    public List<String> sortAccordingToPopulation() {
        try {
            Files.lines(Paths.get(this.file))
                    .map(row -> row.split(","))
                    .sorted((a, b) -> a[5].compareTo(b[5]))
                    .map(row -> row[3] + " (" + row[4] + "), " + row[2].substring(0, row[2].length() - 3).trim() + ", "
                            + row[5])
                    .forEach(row -> this.rows.add(row));
        } catch (Exception e) {
            System.out.println("Error:");
        }
        return this.rows;
    }
}
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public static List<String> read(String file) {
        List<String> rows = new ArrayList<>();
        try {
            Files.lines(Paths.get(file)).forEach(row -> rows.add(row));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return rows;
    }

    public static void main(String[] args) {
        List<String> list = read("rand_txt.txt");
        list.forEach(row -> System.out.println(row));

    }
}
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader("literacy.csv");
        List<String> sortedFile = fileReader.sortAccordingToPopulation();
        sortedFile.forEach(v -> System.out.println(v));

    }
}

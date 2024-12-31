import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> result = new ArrayList<>();
        while (true) {
            System.out.println("Type a number");
            int value = scanner.nextInt();
            result.add(value);
            if (value == 0) {
                List<Integer> avg = result.stream()
                        .filter(val -> val > 0)
                        .toList();
                if (avg.isEmpty()) {
                    System.out.println("Cannot calculate average");
                    break;
                } else {
                    double average = avg.stream()
                            .mapToDouble(Double::valueOf)
                            .average()
                            .orElse(0);
                    System.out.println(average);
                    break;
                }
            }
        }
    }
}

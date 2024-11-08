import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class AverageSelected {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> myList = new ArrayList<>();
        while (true) {
            String message = scanner.nextLine();
            if (message.equals("end"))
                break;

            myList.add(message);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String anotherMessage = scanner.nextLine();
        if (anotherMessage.equals("n")) {
            double result = myList.stream()
                    .mapToInt(Integer::valueOf)
                    .filter(val -> val < 0)
                    .average()
                    .getAsDouble();
            System.out.println(result);
        } else if (anotherMessage.equals("p")) {
            double result = myList.stream()
                    .mapToInt(Integer::valueOf)
                    .filter(val -> val > 0)
                    .average()
                    .getAsDouble();
            System.out.println(result);
        } else {
            return;
        }
    }
}

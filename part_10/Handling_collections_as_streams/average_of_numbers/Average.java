import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> myList = new ArrayList<>();
        while (true) {
            String message = scanner.nextLine();
            if (message.equals("end"))
                break;
            myList.add(message);
        }
        double result = myList.stream()
                .mapToInt(Integer::valueOf)
                .average()
                .getAsDouble();
        System.out.println(result);
    }
}

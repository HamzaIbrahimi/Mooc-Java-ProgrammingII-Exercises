import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
                .filter(v -> v > 0)
                .collect(Collectors.toList());
    }

    public static ArrayList<Integer> positive(ArrayList<Integer> numbers) {
        return numbers.stream()
                .filter(v -> v > 0)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        while (true) {
            String message = scanner.nextLine();
            if (message.equals("end"))
                break;
            list1.add(Integer.valueOf(message));
            list2.add(Integer.valueOf(message));
        }

        System.out.println(positive(list2).toString());

    }

}

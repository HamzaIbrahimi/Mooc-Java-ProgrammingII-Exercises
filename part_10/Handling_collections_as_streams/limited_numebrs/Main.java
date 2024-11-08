import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            String message = scanner.nextLine();
            if (Integer.valueOf(message) < 0)
                break;
            list.add(Integer.valueOf(message));
        }
        list.stream()
                .filter(v -> v <= 5)
                .forEach(System.out::println);
    }
}
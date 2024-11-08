import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String message = scanner.nextLine();
            if (message.isBlank())
                break;
            list.add(message);
        }
        list.forEach(msg -> System.out.println(msg));
    }
}
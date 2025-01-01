import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        Container container2 = new Container();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("First " + container);
            System.out.println("Second " + container2);
            String input = scanner.nextLine();
            String[] inputArray = input.split(" ");
            String command = inputArray[0];
            int amount = Integer.parseInt(inputArray[1]);

            if (command.equals("quit")) {
                break;
            }
            if (command.equals("add")) {
                container.add(amount);
            }

            if (command.equals("move")) {
                container2.add(amount);
                container.remove(amount);
            }

            if (command.equals("remove")) {
                if (container.contains() > container2.contains()) {
                    container.remove(amount);
                } else {
                    container2.remove(amount);
                }
            }

        }
    }
}

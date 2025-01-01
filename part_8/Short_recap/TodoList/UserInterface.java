import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }

            else if (input.equals("add")) {
                System.out.println("To add: ");
                String task = scanner.nextLine();
                todoList.add(task);
            }

            else if (input.equals("list")) {
                todoList.print();
            }

            else if (input.equals("remove")) {
                System.out.println("please enter the id of the task you would like removed");
                int id = Integer.parseInt(scanner.nextLine());
                todoList.remove(id);
            }
        }
    }

}

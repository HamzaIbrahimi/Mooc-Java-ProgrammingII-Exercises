import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstVolume = 0;
        int secondVolume = 0;
        int maxVolume = 100;

        while (true) {
            System.out.println("First:" + firstVolume + "/" + maxVolume);
            System.out.println("Second:" + secondVolume + "/" + maxVolume);
            String input = scanner.nextLine();
            String[] inputArray = input.split(" ");
            String command = inputArray[0];
            int amount = Integer.parseInt(inputArray[1]);
            if (amount < 0)
                continue;

            if (input.equals("quit")) {
                break;
            }
            if (command.equals("add")) {
                if (firstVolume + amount <= 100) {
                    firstVolume += amount;
                } else if (amount + firstVolume > 100) {
                    firstVolume = maxVolume;
                }
            }

            if (command.equals("move")) {
                if (firstVolume >= amount) {
                    if (secondVolume + amount < 100) {
                        secondVolume += amount;
                    } else {
                        secondVolume = maxVolume;
                    }
                    firstVolume -= amount;
                } else if (amount > firstVolume) {
                    secondVolume = firstVolume;
                    firstVolume = 0;
                }
            }

            if (command.equals("remove")) {
                if (secondVolume > amount) {
                    secondVolume -= amount;
                } else if (secondVolume - amount < 0) {
                    secondVolume = 0;
                }
            }

        }

    }
}
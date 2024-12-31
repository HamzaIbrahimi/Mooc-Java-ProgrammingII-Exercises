import java.util.Scanner;

public class Cube {

    public void findCubes() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Type a number and I cube it");
            String value = scanner.nextLine();
            if (value.equals("end")) {
                break;
            } else {
                System.out.println(Math.pow(Integer.parseInt(value), 3));
            }
        }
    }

    public static void main(String[] args) {
        Cube cube = new Cube();
        cube.findCubes();
    }
}

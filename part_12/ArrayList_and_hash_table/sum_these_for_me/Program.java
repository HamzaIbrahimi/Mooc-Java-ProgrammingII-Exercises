import java.util.Arrays;

public class Program {

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        if (fromWhere < 0) {
            fromWhere = 0;
        }
        if (toWhere > array.length) {
            toWhere = array[array.length - 1];
        }

        return Arrays.stream(Arrays.copyOfRange(array, fromWhere, toWhere))
                .filter(val -> val >= smallest && val <= largest)
                .sum();
    }

    public static void main(String[] args) {
        int[] numbers = { 3, -1, 8, 4 };

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));

    }
}

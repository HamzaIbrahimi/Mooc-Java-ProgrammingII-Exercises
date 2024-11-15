import java.util.List;
import java.util.ArrayList;

public class Checker {

    public static boolean isDayOfWeek(String string) {
        return string.matches("(?i)(Mon|Tue|Wed|Thu|Fri|Sat|Sun)");
    }

    public static boolean allVowels(String string) {
        return string.matches("(?i)[aeiou]*");
    }

    public static boolean timeOfDay(String string) {
        return string.matches("([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]");
    }

    public static void main(String[] args) {
        List<String> listAbb = new ArrayList<>(List.of("mon", "wed", "dsa", "sun", "wan"));

        listAbb.forEach(v -> {
            System.out.println(isDayOfWeek(v));
        });
        System.out.println();
        List<String> listVowels = new ArrayList<>(List.of("daskfm", "aiou", "cool", "bool", "ooeiuea", "AEIOU"));

        listVowels.forEach(v -> {
            System.out.println(allVowels(v));
        });
        System.out.println();

        System.out.println(timeOfDay(("33:33:33")));
        System.out.println(timeOfDay(("17:23:05")));
        System.out.println(timeOfDay(("abc")));
    }
}

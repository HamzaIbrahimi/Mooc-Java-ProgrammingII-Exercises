import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

    public static String randString() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        String str = "abcdefghijklmnopqrstuvwxyz";
        char[] charArray = str.toCharArray();
        for (int i = 0; i < 6; i++) {
            int randomNum = random.nextInt(0, charArray.length);
            stringBuilder.append(charArray[randomNum]);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        List<Student> info = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            info.add(new Student(randString()));
        }
        info.forEach(System.out::println);
        System.out.println();
        Collections.sort(info);
        info.forEach(System.out::println);
    }

}

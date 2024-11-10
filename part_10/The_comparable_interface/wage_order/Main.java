import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Human> member = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            member.add(new Human("Hamza" + i, i * 600));
        }
        member.forEach(m -> System.out.println(m));
        System.out.println();
        Collections.sort(member); // mutates the array
        member.forEach(m -> System.out.println(m));
    }
}

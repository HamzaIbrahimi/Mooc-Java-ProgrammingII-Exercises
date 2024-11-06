import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    List<Movable> organismList;

    public Herd() {
        this.organismList = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.organismList
                .forEach(organism -> {
                    stringBuilder.append(organism + "\n");
                });
        return stringBuilder.toString();
    }

    public void addToHerd(Movable movable) {
        this.organismList.add(movable);
    }

    public void move(int dx, int dy) {
        this.organismList
                .forEach(organism -> {
                    organism.move(dx, dy);
                });
    }

}

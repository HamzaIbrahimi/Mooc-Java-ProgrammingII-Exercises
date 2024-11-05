import java.util.ArrayList;

public class Box implements Packable {

    private ArrayList<Packable> items;
    private double capacity;

    public Box(double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable packable) {
        if (capacity >= packable.weight() && capacity >= weight()) {
            items.add(packable);
        }
    }

    public double weight() {
        return this.items.stream()
                .map(Packable::weight)
                .mapToDouble(Double::doubleValue)
                .sum();
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() +
                ", total weight " +
                weight() +
                " kg";

    }

}

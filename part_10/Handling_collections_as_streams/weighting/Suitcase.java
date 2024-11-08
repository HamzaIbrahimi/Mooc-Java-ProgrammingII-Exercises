import java.util.ArrayList;
import java.util.Comparator;

import java.util.List;

public class Suitcase {

    private List<Item> contents;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.contents = new ArrayList<>();
    }

    public int currentWeight() {
        return contents.stream()
                .map(Item::getWeight)
                .mapToInt(Integer::valueOf)
                .sum();
    }

    public void addItem(Item i) {
        if (this.currentWeight() + i.getWeight() <= this.maxWeight) {
            this.contents.add(i);
        }

    }

    @Override
    public String toString() {
        if (this.contents.isEmpty()) {
            return "no items (" + this.currentWeight() + " kg)";
        }
        if (this.contents.size() == 1) {
            return this.contents.size() + " item (" + this.currentWeight() + " kg)";
        } else
            ;
        return this.contents.size() + " items (" + this.currentWeight() + " kg)";
    }

    public void printItems() {
        contents.forEach(content -> System.out.println(content));
    }

    public int totalWeight() {
        return contents.stream()
                .map(Item::getWeight)
                .mapToInt(Integer::valueOf)
                .sum();
    }

    public Item heaviestItem() {
        if (this.contents.isEmpty()) {
            return null;
        }
        return this.contents.stream()
                .max((a, b) -> a.getWeight() - b.getWeight())
                .get();
    }

}

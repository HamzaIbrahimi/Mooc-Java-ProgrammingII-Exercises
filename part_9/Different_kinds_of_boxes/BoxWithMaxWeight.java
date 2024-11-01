import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> listOfItems;
    private int totalWeights;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.listOfItems = new ArrayList<>();
        this.totalWeights = 0;
    }

    public void add(Item item) {
        if (this.capacity >= totalWeights + item.getWeight()) {
            this.totalWeights += item.getWeight();
            this.listOfItems.add(item);
        }
    }

    public boolean isInBox(Item item) {
        return this.listOfItems.contains(item)
                ? true
                : false;
    }

}

import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    private int maxWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public int currentWeight() {
        return suitcases.stream()
                .map(Suitcase::totalWeight)
                .reduce(0, (current, total) -> current + total);

    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.currentWeight() + suitcase.totalWeight() <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    @Override
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.currentWeight() + " kg)";
    }

    public void printItems() {
        suitcases.forEach(suitcase -> suitcase.printItems());
    }

}
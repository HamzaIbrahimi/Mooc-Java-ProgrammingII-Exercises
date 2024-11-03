import java.util.ArrayList;
// import java.util.stream.Collectors;

public class ChangeHistory {
    private ArrayList<Double> historyOfWarehouse;

    public ChangeHistory() {
        this.historyOfWarehouse = new ArrayList<>();
    }

    public void add(double status) {
        this.historyOfWarehouse.add(status);
    }

    public void clear() {
        this.historyOfWarehouse.clear();
    }

    public String toString() {
        return this.historyOfWarehouse.toString();
    }

    public double maxValue() {
        return this.historyOfWarehouse.stream()
                .mapToDouble(d -> d.doubleValue())
                .max()
                .orElse(0);

    }

    public double minValue() {
        return this.historyOfWarehouse.stream()
                .mapToDouble(d -> d.doubleValue())
                .min()
                .orElse(0);

    }

    public double average() {
        double result = this.historyOfWarehouse.stream()
                .mapToDouble(Double::doubleValue) // another simpler ways
                .average()
                .orElse(0);
        return result;
    }

}

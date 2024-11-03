import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> pricesMap;
    private Map<String, Integer> stockMap;

    public Warehouse() {
        this.pricesMap = new HashMap<>();
        this.stockMap = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.pricesMap.put(product, price);
        this.stockMap.put(product, stock);
    }

    public int price(String product) {
        return this.pricesMap.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return this.stockMap.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (this.stockMap.containsKey(product) && this.stockMap.get(product) > 0) {
            int newStock = this.stockMap.get(product) - 1;
            this.stockMap.put(product, newStock);
            return true;
        }

        return false;
    }

    public Set<String> products() {
        return this.pricesMap.keySet();

    }

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("coffee", 5, 6);
        warehouse.addProduct("buttermilk", 2, 20);
        warehouse.addProduct("yogurt", 2, 20);

        System.out.println("products:");

        for (String product : warehouse.products()) {
            System.out.println(product);
        }
    }

}

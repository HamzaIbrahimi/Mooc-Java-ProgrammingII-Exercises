import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> cart;

    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    public void add(String product, int price) {
        Item newItem = new Item(product, 1, price);
        for (Item item : cart) {
            if (item.equals(newItem)) {
                item.increaseQuantity();
                return;
            }
        }
        this.cart.add(newItem);

    }

    public int price() {
        return this.cart.stream()
                .map(Item::price)
                .mapToInt(Integer::valueOf)
                .sum();
    }

    public void print() {
        this.cart.forEach(System.out::println);
    }

}

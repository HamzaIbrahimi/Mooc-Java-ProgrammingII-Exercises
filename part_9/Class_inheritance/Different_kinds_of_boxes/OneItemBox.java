import java.util.ArrayList;

public class OneItemBox extends Box {

    private ArrayList<Item> oneItemList;

    public OneItemBox() {
        this.oneItemList = new ArrayList<>();
    }

    public void add(Item item) {
        if (this.oneItemList.isEmpty()) {
            this.oneItemList.add(item);
        }
    }

    public boolean isInBox(Item item) {
        return this.oneItemList.contains(item)
                ? true
                : false;
    }
}

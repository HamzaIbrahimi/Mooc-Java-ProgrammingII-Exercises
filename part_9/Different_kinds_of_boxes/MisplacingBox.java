import java.util.ArrayList;

public class MisplacingBox extends Box {

    private ArrayList<Item> anyItemList;

    public MisplacingBox() {
        this.anyItemList = new ArrayList<>();
    }

    public void add(Item item) {
        this.anyItemList.add(item);
    }

    public boolean isInBox(Item item) {
        return false;
    }
}

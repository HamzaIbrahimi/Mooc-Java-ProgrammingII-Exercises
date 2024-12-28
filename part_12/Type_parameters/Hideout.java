import java.util.ArrayList;

public class Hideout<T> {
    ArrayList<T> values;

    public Hideout() {
        this.values = new ArrayList<>();
    }

    public void putIntoHideout(T toHide) {
        if (values.isEmpty()) {
            values.add(toHide);
        }
        values.clear();
        values.add(toHide);

    }

    public T takeFromHideout() {
        if (values.isEmpty()) {
            return null;
        }
        T result = this.values.get(0);
        values.clear();
        return result;
    }

    public boolean isInHideout() {
        return !values.isEmpty();
    }

}
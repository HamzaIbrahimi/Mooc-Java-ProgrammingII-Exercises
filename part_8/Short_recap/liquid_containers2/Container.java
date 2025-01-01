public class Container {

    private int amount;
    private int maxAmount;

    public Container() {
        this.amount = 0;
        this.maxAmount = 100;
    }

    public int contains() {
        return amount;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        if (amount + this.amount <= 100) {
            this.amount += amount;
        } else if (amount > maxAmount) {
            this.amount = maxAmount;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        if (this.amount >= amount) {
            this.amount -= amount;
        } else {
            this.amount = 0;
        }

    }

    public String toString() {
        return this.amount + "/" + maxAmount;
    }

}

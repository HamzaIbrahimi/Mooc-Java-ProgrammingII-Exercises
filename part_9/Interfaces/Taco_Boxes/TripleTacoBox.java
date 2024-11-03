public class TripleTacoBox implements TacoBox {

    private int tacos;

    public TripleTacoBox() {
        this.tacos = 0;
    }

    public int tacosRemaining() {
        return this.tacos;
    }

    public void eat() {
        if (this.tacos > 0)
            this.tacos--;
    }

    public static void main(String[] args) {
        TripleTacoBox box = new TripleTacoBox();
        box.eat();
        box.eat();
        box.eat();
        box.eat();
        box.eat();

    }
}

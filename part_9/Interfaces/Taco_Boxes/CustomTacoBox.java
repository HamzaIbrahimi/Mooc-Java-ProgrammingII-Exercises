public class CustomTacoBox implements TacoBox {

    private int tacos;

    public CustomTacoBox() {
        this.tacos = 0;
    }

    public int tacosRemaining() {
        return this.tacos;
    }

    public void eat() {
        if (this.tacos > 0)
            this.tacos--;
    }

}

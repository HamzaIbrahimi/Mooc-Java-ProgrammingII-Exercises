public class Dog extends Animal implements NoiseCapable {

    private String dogName;

    public Dog() {
        super("Dog");
    }

    public Dog(String dogName) {
        super(dogName);
    }

    public void makeNoise() {
        barks();
    }

    public void barks() {
        System.out.println(super.getAnimalName() + " barks");
    }

    public void eat() {
        super.eat();
    }

    public void sleep() {
        super.sleep();
    }
}

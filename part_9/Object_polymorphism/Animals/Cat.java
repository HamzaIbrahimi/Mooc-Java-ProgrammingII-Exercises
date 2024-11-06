public class Cat extends Animal implements NoiseCapable {

    private String catName;

    public Cat(String catName) {
        super(catName);
    }

    public Cat() {
        super("Cat");
    }

    public void makeNoise() {
        purr();
    }

    public void purr() {
        System.out.println(super.getAnimalName() + " purrs");
    }

    public void eat() {
        super.eat();
    }

    public void sleep() {
        super.sleep();
    }
}

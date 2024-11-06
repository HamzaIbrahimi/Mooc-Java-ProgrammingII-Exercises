public abstract class Animal {
    private String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return this.animalName;
    }

    public void eat() {
        System.out.println(getAnimalName() + " eats");
    }

    public void sleep() {
        System.out.println(getAnimalName() + " sleeps");
    }
}
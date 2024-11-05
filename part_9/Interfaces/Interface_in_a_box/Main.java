public class Main {
    public static void main(String[] args) {
        Box box = new Box(10);
        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));
        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));
        Box smallerBox = new Box(25);
        smallerBox.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        smallerBox.add(new Book("Robert Martin", "Clean Code", 1));
        smallerBox.add(new Book("Kent Beck", "Test Driven Development", 0.7));
        smallerBox.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        smallerBox.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        smallerBox.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));
        Box biggerBox = new Box(100);
        biggerBox.add(box);
        biggerBox.add(smallerBox);

        System.out.println(biggerBox);
    }
}

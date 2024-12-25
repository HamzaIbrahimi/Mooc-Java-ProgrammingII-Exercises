public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (age < 0 || age > 120 || name.isEmpty() || name.length() > 40 || name == null) {
            throw new IllegalArgumentException();
        } else {
            this.name = name;
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Employees {

    private List<Person> employeesList;

    public Employees() {
        this.employeesList = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.employeesList.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.forEach(person -> {
            this.employeesList.add(person);
        });
    }

    public void print() {
        this.employeesList.forEach(System.out::println);
    }

    public void print(Education education) {
        this.employeesList.stream()
                .filter(person -> person.getEducation() == education)
                .forEach(System.out::println);
    }

    public void fire(Education education) {
        Iterator<Person> iterate = this.employeesList.iterator();
        while (iterate.hasNext()) {
            if (iterate.next().getEducation() == education) {
                iterate.remove();
            }
        }
        // Simpler method with removeIF
        // this.employeesList.removeIf(person -> person.getEducation() == education);

    }

}
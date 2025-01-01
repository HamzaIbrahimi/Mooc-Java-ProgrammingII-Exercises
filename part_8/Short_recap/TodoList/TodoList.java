import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<String> myToDo;

    public TodoList() {
        this.myToDo = new ArrayList<>();
    }

    public void add(String task) {
        myToDo.add(task);
    }

    public void print() {
        for (int i = 0; i < myToDo.size(); i++) {
            System.out.println(i + 1 + ": " + myToDo.get(i));
        }
    }

    public void remove(int number) {
        myToDo.remove(number - 1);
    }

}

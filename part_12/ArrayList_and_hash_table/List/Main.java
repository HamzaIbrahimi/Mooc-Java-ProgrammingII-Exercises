public class Main {
    public static void main(String[] args) {
        List<String> myList = new List<>();
        myList.add("Hello");
        myList.add("World");
        for (int i = 0; i < myList.length(); i++) {
            System.out.println(myList.value(i));
        }
    }
}

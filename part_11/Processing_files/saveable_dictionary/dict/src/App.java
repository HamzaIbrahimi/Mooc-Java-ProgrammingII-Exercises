import dictionary.SaveableDictionary;

public class App {
    public static void main(String[] args) throws Exception {
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        boolean wasSuccessful = dictionary.load();
        if (wasSuccessful) {
            System.out.println("Success");
        }
        dictionary.save();
    }
}

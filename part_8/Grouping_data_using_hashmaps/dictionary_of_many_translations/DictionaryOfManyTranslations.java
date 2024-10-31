import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> translationsLibrary;

    public DictionaryOfManyTranslations() {
        this.translationsLibrary = new HashMap<>();
    }

    public void add(String word, String Translations) {
        this.translationsLibrary.putIfAbsent(word, new ArrayList<>());
        this.translationsLibrary.get(word).add(Translations);
    }

    public ArrayList<String> translate(String word) {
        if (!this.translationsLibrary.containsKey(word)) {
            return new ArrayList<>();
        }
        return this.translationsLibrary.get(word);

    }

    public void remove(String word) {
        this.translationsLibrary.remove(word);
    }

    public static void main(String[] args) {
        DictionaryOfManyTranslations dictionary = new DictionaryOfManyTranslations();
        dictionary.add("lie", "maata");
        dictionary.add("lie", "valehdella");

        dictionary.add("bow", "jousi");
        dictionary.add("bow", "kumartaa");

        System.out.println(dictionary.translate("lie"));
        dictionary.remove("bow");
        System.out.println(dictionary.translate("bow"));
    }
}
package dictionary;

import java.util.Map;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class SaveableDictionary {
    private Map<String, String> translations;
    private String file;

    public SaveableDictionary(String file) {
        this.translations = new HashMap<>();
        this.file = file;
    }

    public void add(String words, String translation) {
        this.translations.putIfAbsent(words, translation);
    }

    public String translate(String word) {
        for (Map.Entry<String, String> entry : translations.entrySet()) {
            if (entry.getKey().equals(word)) {
                return entry.getValue();
            } else if (entry.getValue().equals(word)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public void delete(String word) {
        String findKey = translations.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equals(word) || entry.getValue().equals(word))
                .map(entry -> entry.getKey())
                .findFirst()
                .orElse(null);
        if (findKey != null) {
            translations.remove(findKey);
        }

    }

    public boolean load() throws FileNotFoundException {
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String[] parts = scanner.nextLine().split(":");
                add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean save() throws Exception {
        try (PrintWriter writer = new PrintWriter(file)) {
            for (Map.Entry<String, String> entry : translations.entrySet()) {
                writer.println(entry.getKey() + ":" + entry.getValue());
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}

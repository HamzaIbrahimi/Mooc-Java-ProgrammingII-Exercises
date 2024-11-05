import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.*;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Includes List/Map/Set as a parameter methods
class Main {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");
        Function<List<String>, Integer> returnSizeList = list -> list.size();
        System.out.println(returnSizeList.apply(names));

        Function<Map<String, String>, Integer> returnSizeMap = map -> map.size();
        Map<String, String> names1 = new HashMap<>();
        names1.put("1", "first");
        names1.put("2", "second");
        System.out.println(returnSizeMap.apply(names1));

        Set<String> setShow = new HashSet<>();
        setShow.add("one");
        setShow.add("one");
        setShow.add("two");
        Consumer<Set<String>> showSet = set -> set.forEach(System.out::println);
        showSet.accept(setShow);

        Function<Set<String>, Integer> setSize = set -> set.size();
        Set<String> sizeSet = new HashSet<>();
        sizeSet.add("first");
        sizeSet.add("first");
        sizeSet.add("second");
        sizeSet.add("second");
        sizeSet.add("second");
        System.out.println(setSize.apply(sizeSet));

    }
}
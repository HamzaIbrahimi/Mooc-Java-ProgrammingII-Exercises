import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storageUnit;

    public StorageFacility() {
        this.storageUnit = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storageUnit.putIfAbsent(unit, new ArrayList<>());
        this.storageUnit.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (!this.storageUnit.containsKey(storageUnit)) {
            return new ArrayList<>();
        }
        return this.storageUnit.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {
        this.storageUnit.get(storageUnit).remove(item);
        if (this.storageUnit.get(storageUnit).isEmpty()) {
            this.storageUnit.remove(storageUnit);
        }

    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnitNames = new ArrayList<>();
        this.storageUnit.forEach((k, v) -> storageUnitNames.add(k));
        return storageUnitNames;
    }

    public static void main(String[] args) {
        StorageFacility facility = new StorageFacility();
        // facility.add("a14", "ice skates");
        // facility.add("a14", "ice hockey stick");
        // facility.add("a14", "ice skates");

        // facility.add("f156", "rollerblades");
        // facility.add("f156", "rollerblades");

        // facility.add("g63", "six");
        // facility.add("g63", "pi");

        // System.out.println(facility.contents("a14"));
        // System.out.println(facility.contents("f156"));
        facility.add("a14", "ice skates");
        facility.add("a14", "ice hockey stick");
        facility.add("a14", "ice skates");

        facility.add("f156", "rollerblades");
        facility.add("f156", "rollerblades");

        facility.add("g63", "six");
        facility.add("g63", "pi");

        facility.remove("f156", "rollerblades");
        System.out.println(facility.contents("f156"));

        facility.remove("f156", "rollerblades");

        System.out.println(facility.storageUnits());

    }
}
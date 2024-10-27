import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> licenseWithOwner;

    public VehicleRegistry() {
        this.licenseWithOwner = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!licenseWithOwner.containsKey(licensePlate)) {
            this.licenseWithOwner.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        return this.licenseWithOwner.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        return this.licenseWithOwner.remove(licensePlate) != null;
    }

    public void printLicensePlates() {
        this.licenseWithOwner.forEach((k, v) -> System.out.println(k));
    }

    public void printOwners() {
        this.licenseWithOwner.forEach((k, v) -> System.out.println(v));
    }
}

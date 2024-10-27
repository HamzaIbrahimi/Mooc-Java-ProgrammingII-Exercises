import java.util.ArrayList;
import java.util.HashMap;

public class LicensePlate {

    // these instance variables have been defined as final, meaning
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((liNumber == null) ? 0 : liNumber.hashCode());
        result = prime * result + ((country == null) ? 0 : country.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LicensePlate other = (LicensePlate) obj;
        if (liNumber == null) {
            if (other.liNumber != null)
                return false;
        } else if (!liNumber.equals(other.liNumber))
            return false;
        if (country == null) {
            if (other.country != null)
                return false;
        } else if (!country.equals(other.country))
            return false;
        return true;
    }

    public static void main(String[] args) {

        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "BWQ-431");
        LicensePlate li4 = new LicensePlate("FI", "QZY-123");
        LicensePlate li5 = new LicensePlate("DK", "QZY-123");
        VehicleRegistry vh = new VehicleRegistry();

    }
}

public class CD implements Packable {

    private final String artist;
    private final String nameOfCd;
    private final int year;
    private final double weightOfCd;

    public CD(String artist, String nameOfCd, int year) {
        this.artist = artist;
        this.nameOfCd = nameOfCd;
        this.year = year;
        this.weightOfCd = 0.1;
    }

    public double weight() {
        return this.weightOfCd;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.nameOfCd + " (" + this.year + ")";
    }

}

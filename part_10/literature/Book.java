public class Book {

    private String title;
    private int recommendedAge;

    public Book(String title, int recommendedAge) {
        this.title = title;
        this.recommendedAge = recommendedAge;
    }

    @Override
    public String toString() {
        return getTitle() + " (Recommended for " + getRecommendedAge() + " year-olds or older)";
    }

    public String getTitle() {
        return title;
    }

    public int getRecommendedAge() {
        return recommendedAge;
    }
}

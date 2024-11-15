import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private List<Card> listOfCards;

    public Hand() {
        this.listOfCards = new ArrayList<>();
    }

    public void add(Card card) {
        this.listOfCards.add(card);
    }

    public void print() {
        this.listOfCards.forEach(System.out::println);
    }

    public void sort() {
        Collections.sort(this.listOfCards);
    }

    @Override
    public int compareTo(Hand hand) {
        return this.listOfCards.stream()
                .map(Card::getValue)
                .mapToInt(Integer::valueOf)
                .sum()
                - hand.listOfCards.stream()
                        .map(Card::getValue)
                        .mapToInt(Integer::valueOf)
                        .sum();
    }
}

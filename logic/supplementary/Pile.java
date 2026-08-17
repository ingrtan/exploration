package logic.supplementary;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Pile{
    protected List<Card> cards;
    
    public Pile() {
    }

    public void shuffle() {
        cards = cards.stream()
            .collect(Collectors.collectingAndThen(Collectors.toList(), collected -> {
                java.util.Collections.shuffle(collected);
                return collected;
            }));
    }

    public void addCard(Card card) {
        cards.add(card);
    }
}

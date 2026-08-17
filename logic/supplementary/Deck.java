package logic.supplementary;

public class Deck extends Pile {
    public Deck() {
        
    }

    public Card drawCard() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(cards.size() - 1);
    }
}

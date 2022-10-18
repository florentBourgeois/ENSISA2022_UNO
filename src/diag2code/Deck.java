package diag2code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Deck implements LastPlayedCardProviderITF{
    private final LinkedList<Card> draw = new LinkedList<>();;
    private final LinkedList<Card> played = new LinkedList<>();;

    public Deck(List<Card> all) {
        draw.addAll(all);
    }

    public void addCardToPlayed(Card card) {
        this.played.addFirst(card);
    }

    public Card getLastPlayedCard() {
        if(this.played.isEmpty()) {
            return null;
        }
        return this.played.getFirst();
    }

    public Card drawACard() {
        return this.draw.pop();
    }

    @Override
    public String toString() {
        return "Deck{" +
                "draw=" + draw +
                ", played=" + played +
                '}';
    }
}

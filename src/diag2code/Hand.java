package diag2code;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private final List<Card> cards = new ArrayList<>();

    public void pickedACard(Card card){
        cards.add(card);
    }

    public void playCard(Card card){
        this.cards.remove(card);
    }

    public boolean holdsCard(Card card){
        return this.cards.contains(card); // warning ! only works for identical cards object
    }

    public int nbrOfCards(){
        return this.cards.size();
    }

    @Override
    public String toString() {
        return "Hand{" +
                "cards=" + cards +
                '}';
    }


}

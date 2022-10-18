package diag2code;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private final List<Card> cards = new ArrayList<>();

    public Hand() {
    }

    public void pickedCard(Card card){
        cards.add(card);
    }

    public Card playCard(Card card){
        int index = this.cards.indexOf(card);
        if(index == -1){ // handle hand does not hold card case
            return null;
        }
        return this.cards.remove(index);
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

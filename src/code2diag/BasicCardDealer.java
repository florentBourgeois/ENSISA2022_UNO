package code2diag;

import diag2code.Card;
import diag2code.Deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * This class represents a card dealer.
 * Better version of card dealer must access to draw and played cards.
 * This would enables the dealer to shuffle, put back leavers cards, ...
 */
public class BasicCardDealer implements CardDealerInterface {

    private final Deck deck;
    private int nbrOfCardsDealed;

    public BasicCardDealer(Deck deck) {
        this.deck = deck;
    }




    @Override
    public void cardPlayed(Card card) {
        this.deck.addCardToPlayed(card);
    }

    @Override
    public Card getLastPlayedCard() {
        return this.deck.getLastPlayedCard();
    }

    @Override
    public Card pickCard() {
        return this.deck.drawACard();
    }

}

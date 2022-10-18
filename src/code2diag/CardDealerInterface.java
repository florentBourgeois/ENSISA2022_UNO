package code2diag;

import diag2code.Card;

public interface CardDealerInterface {

    public void cardPlayed(Card c);
    public Card getLastPlayedCard();
    public Card pickCard();

}

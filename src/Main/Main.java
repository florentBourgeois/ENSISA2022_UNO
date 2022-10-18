package Main;

import code2diag.BasicCardDealer;
import code2diag.CardDealerInterface;
import code2diag.PlayCardProcessor;
import diag2code.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //basicGame();
        completeGAme();
    }

    public static void basicGame() {
        List<Card> cards = new ArrayList<>();
        Card card0 = new Card("rouge", "0");
        cards.add(card0);
        Card card1 = new Card("jaune", "1");
        cards.add(card1);
        Card card2 = new Card("jaune", "2");
        cards.add(card2);
        Card card3 = new Card("jaune", "3");
        cards.add(card3);

        for (int i = 0; i < 100; i++) {
            cards.add(new Card("bleu", String.valueOf(i)));
        }

        Deck deck = new Deck(cards);


        Table table = new Table(deck);
        //CardDealerInterface cardDealer = new CardDealer();

        Player pascal = table.playerSits("pascal");
        table.playerSits("Jack");
        table.playerSits("Fred");
        Player mike = table.playerSits("Mike");

        pascal.getHand().pickedACard(deck.drawACard());//cardDealer.pickCard());//get rouge 0
        mike.getHand().pickedACard(deck.drawACard());//cardDealer.pickCard());  //get jaune 1
        mike.getHand().pickedACard(deck.drawACard());//cardDealer.pickCard());  //get jaune 2
        mike.getHand().pickedACard(deck.drawACard());//cardDealer.pickCard());  //get jaune 3
        mike.getHand().pickedACard(deck.drawACard());//cardDealer.pickCard());  //get bleu 0

        System.out.println(pascal);
        System.out.println(mike);
        System.out.println(table);
        deck.addCardToPlayed(card0);
        pascal.getHand().playCard(card0);
        table.setLastPlayer(pascal);
        System.out.println(pascal);
        System.out.println(table);
    }



    public static void completeGAme(){
        List<Card> cards = new ArrayList<>();
        Card card0 = new Card("rouge", "0");
        cards.add(card0);
        Card card1 = new Card("jaune", "1");
        cards.add(card1);
        Card card2 = new Card("jaune", "2");
        cards.add(card2);
        Card card3 = new Card("jaune", "3");
        cards.add(card3);

        for (int i = 0; i < 100; i++) {
            cards.add(new Card("bleu", String.valueOf(i)));
        }

        Deck deck = new Deck(cards);



        Table table = new Table(deck);


        Player pascal = table.playerSits("pascal");
        table.playerSits("Jack");
        table.playerSits("Fred");
        Player mike = table.playerSits("Mike");

        CardDealerInterface cardDealer = new BasicCardDealer(deck);
        pascal.getHand().pickedACard(cardDealer.pickCard());//get rouge 0
        mike.getHand().pickedACard(cardDealer.pickCard());  //get jaune 1
        mike.getHand().pickedACard(cardDealer.pickCard());  //get jaune 2
        mike.getHand().pickedACard(cardDealer.pickCard());  //get jaune 3
        mike.getHand().pickedACard(cardDealer.pickCard());  //get bleu 0



        PlayCardProcessor playCardProcessor = new PlayCardProcessor(table, cardDealer);
        System.out.println(playCardProcessor.handlePlayCard(mike, card1)); // ok
        System.out.println(playCardProcessor.handlePlayCard(mike, card2)); // not right player
        System.out.println(playCardProcessor.handlePlayCard(mike, card0)); // does not have card
        System.out.println(playCardProcessor.handlePlayCard(pascal, card0)); // not valid card (color + value)

//*/
    }
}

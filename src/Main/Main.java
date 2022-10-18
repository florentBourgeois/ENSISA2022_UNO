package Main;

import diag2code.Card;
import diag2code.Deck;
import diag2code.Player;
import diag2code.Table;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        basicGame();
        //completeGAme();
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


/*
        PlayCardProcessor playCardProcessor = new PlayCardProcessor(table, cardDealer);
        System.out.println(playCardProcessor.playCard(mike, card1));
        System.out.println(playCardProcessor.playCard(mike, card2));
        System.out.println(playCardProcessor.playCard(mike, card0));
        System.out.println(playCardProcessor.playCard(pascal, card0));

//*/
    }
}

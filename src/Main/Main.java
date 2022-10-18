package Main;

public class Main {

    public static void main(String[] args) {
        basicGame();
    }


    basicGame(){
        Deck deck = new Deck();
        Card card0 = new Card("rouge", 0);
        deck.addCard(card0);
        Card card1 = new Card("jaune", 1);
        decl.addCard(card1);
        Card card2 = new Card("jaune", 2);
        deck.addCard(card2);
        Card card3 = new Card("jaune", 3);
        deck.addCard(card3);

        for (int i = 0; i < 100; i++) {
            deck.addCard(new Card("bleu", String.valueOf(i)));
        }
        return deck;



        Table table = new Table(deck);
        CardDealerInterface cardDealer = new CardDealer();

        Player pascal = table.playerSits("pascal");
        table.playerSits("Jack");
        table.playerSits("Fred");
        Player mike = table.playerSits("Mike");

        pascal.getHand().pickedACard(cardDealer.pickCard());//get rouge 0
        mike.getHand().pickedACard(cardDealer.pickCard());  //get jaune 1
        mike.getHand().pickedACard(cardDealer.pickCard());  //get jaune 2
        mike.getHand().pickedACard(cardDealer.pickCard());  //get jaune 3
        mike.getHand().pickedACard(cardDealer.pickCard());  //get bleu 0



        PlayCardProcessor playCardProcessor = new PlayCardProcessor(table, cardDealer);
        System.out.println(playCardProcessor.playCard(mike, card1));
        System.out.println(playCardProcessor.playCard(mike, card2));
        System.out.println(playCardProcessor.playCard(mike, card0));
        System.out.println(playCardProcessor.playCard(pascal, card0));


    }
}

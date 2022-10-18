package code2diag;

import diag2code.Card;
import diag2code.Player;
import diag2code.Table;

public class PlayCardProcessor implements PlayCardProcessorITF {
    private final Table table;
    private final CardDealerInterface cardDealer;


    public PlayCardProcessor(Table table, CardDealerInterface cardDealer) {
        this.table = table;
        this.cardDealer = cardDealer;
    }

    @Override
    public PlayCardHandleResult handlePlayCard(Player p, Card c) {

        if(this.isFirstMove()) {
            this.table.setLastPlayer(p);
            p.getHand().playCard(c);
            cardDealer.cardPlayed(c);
            return new PlayCardHandleResult(p, c, true, "First move");
        }
        if(!this.playerHasCard(p, c))
            return new PlayCardHandleResult(p, c, false, "Player does not have card");
        if(!this.isPlayerTurn(table, p))
            return new PlayCardHandleResult(p, c, false, "Not player turn");
        if(!this.isValidCard(c, table.getLastPlayedCard()))
            return new PlayCardHandleResult(p, c, false, "Not valid card");

        this.table.setLastPlayer(p);
        p.getHand().playCard(c);
        cardDealer.cardPlayed(c);
        return new PlayCardHandleResult(p, c, true, "Valid move");
    }

    private boolean isFirstMove() {
        return this.table.getLastPlayedCard() == null;
    }

    private boolean playerHasCard(Player player, Card played) {
        return player.getHand().holdsCard(played);
    }

    public static boolean isPlayerTurn(Table table, Player currentPlayer) {
        Player previousPlayer = table.getLastPlayer();
        int previousPlayerPosition = table.getPlayerPosition(previousPlayer);
        int currentPlayerPosition = table.getPlayerPosition(currentPlayer);
        return ((previousPlayerPosition + 1 == currentPlayerPosition) ||
                ((previousPlayerPosition == table.getNumberOfPlayer() - 1) && currentPlayerPosition == 0));
    }

    private boolean isValidCard(Card played, Card lastCard){
        if(lastCard.color().equals(played.color()))
            return true;
        if(lastCard.value().equals(played.value()))
            return true;
        return false;
    }

}

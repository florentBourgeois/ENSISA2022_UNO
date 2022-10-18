package diag2code;

import java.util.ArrayList;
import java.util.List;

public class Table {

    private final LastPlayedCardProviderITF lastPlayedCardProvider;
    private final List<Player> players = new ArrayList<>();
    private Player lastPlayer;

    public Table(LastPlayedCardProviderITF lastPlayedCardProvider) {
        this.lastPlayedCardProvider = lastPlayedCardProvider;
    }

    public int getNumberOfPlayer(){
        return this.players.size();
    }

    public Player playerSits(String name) {
        Player player = new Player(name, this);
        this.players.add(player);
        return player;
    }

    public int getPlayerPosition(Player player) {
        return this.players.indexOf(player);
    }

    public Card getLastPlayedCard() {
        return this.lastPlayedCardProvider.getLastPlayedCard();
    }

    public Player getLastPlayer() {
        return lastPlayer;
    }

    public void setLastPlayer(Player lastPlayer) {
        this.lastPlayer = lastPlayer;
    }

    @Override
    public String toString() {
        return "Table{" +
                "lastPlayedCard=" + lastPlayedCardProvider.getLastPlayedCard() +
                ", players=" + players +
                ", lastPlayer=" + lastPlayer +
                '}';
    }
}

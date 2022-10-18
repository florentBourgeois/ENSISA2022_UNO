package diag2code;

import java.util.ArrayList;
import java.util.List;

public class Table {

    private final Deck deck;
    private final List<Player> players = new ArrayList<>();
    private Player lastPlayer;

    public Table(Deck deck) {
        this.deck = deck;
    }



}

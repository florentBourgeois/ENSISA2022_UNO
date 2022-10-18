package diag2code;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    List<Card> draw = new ArrayList<>();;
    List<Card> played = new ArrayList<>();;

    public Deck(List<Card> all) {
        this.draw = all;
    }

}

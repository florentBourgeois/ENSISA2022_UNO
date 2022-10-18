package code2diag;

import diag2code.Card;
import diag2code.Player;

public record PlayCardHandleResult(Player p, Card c, boolean isValidMove, String message) {

}

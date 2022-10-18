package diag2code;

public class Player {
    private final String name;
    private final Table table;
    private final Hand hand = new Hand();

    public Player(String name, Table table) {
        this.name = name;
        this.table = table;
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public int getNumberOfCards() {
        return this.hand.nbrOfCards();
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hand=" + hand +
                '}';
    }
}

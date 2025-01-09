import java.util.ArrayList;

public abstract class Player {
    private ArrayList<Card> hand;
    private int sum;
    private int aceCount;

    public Player() {
        hand = new ArrayList<>();
        sum = 0;
        aceCount = 0;
    }

    public int getSum() {
        return reduceAce(sum);
    }

    public void addCard(Card card) {
        hand.add(card);

        int cardValue = card.getValue(sum);
        sum += cardValue;
        if (card.isAce()) {
            aceCount++;
        }

        sum = reduceAce(sum);
    }
    private int reduceAce(int sum) {
        while (sum > 21 && aceCount > 0) {
            sum -= 10;
            aceCount--;
        }
        return sum;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }
}

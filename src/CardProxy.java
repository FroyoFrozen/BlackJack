public class CardProxy extends Card {
    private Card actualCard;

    public CardProxy(String value, String type) {
        super(value, type);
        this.actualCard = new Card(value, type);
    }

    @Override
    public int getValue(int playerSum) {
        System.out.println("Accessing value of card: " + actualCard.toString());
        return actualCard.getValue(playerSum);
    }

    @Override
    public String toString() {
        return actualCard.toString();
    }

    @Override
    public boolean isAce() {
        return actualCard.isAce();
    }

    @Override
    public String getImagePath() {
        return actualCard.getImagePath();
    }
}
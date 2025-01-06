public class Dealer extends Player {
    private Card hiddenCard;

    public Dealer() {
        super();
    }

    public void setHiddenCard(Card card) {
        hiddenCard = card;
    }

    public Card getHiddenCard() {
        return hiddenCard;
    }

    public void revealHiddenCard() {
        addCard(hiddenCard);
    }
}

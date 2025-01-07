public class Dealer extends Player {
    private Card hiddenCard;
    private DealerStrategy strategy;

    public Dealer() {
        super();
        this.strategy = new HitBelowSeventeenStrategy();
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

    public void setStrategy(DealerStrategy strategy) {
        this.strategy = strategy;
    }

    public void play(Deck deck) {
        revealHiddenCard();
        while (strategy.shouldHit(getSum())) {
            addCard(deck.dealCard());
        }
    }
}

public class BlackJackGameBuilder {
    private Deck deck;
    private Gambler gambler;
    private Dealer dealer;

    public BlackJackGameBuilder setDeck(Deck deck) {
        this.deck = deck;
        return this;
    }

    public BlackJackGameBuilder setGambler(Gambler gambler) {
        this.gambler = gambler;
        return this;
    }

    public BlackJackGameBuilder setDealer(Dealer dealer) {
        this.dealer = dealer;
        return this;
    }

    public BlackJackGame build() {
        return new BlackJackGame(this);
    }

    // Getters for deck, gambler, and dealer
    public Deck getDeck() {
        return deck;
    }

    public Gambler getGambler() {
        return gambler;
    }

    public Dealer getDealer() {
        return dealer;
    }
}
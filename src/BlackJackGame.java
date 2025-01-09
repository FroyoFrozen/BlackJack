import java.util.ArrayList;

public class BlackJackGame {
    private Deck deck;
    private Gambler gambler;
    private Dealer dealer;

    DealerFactory dealerFactory = new DealerFactory();
    GamblerFactory gamblerFactory = new GamblerFactory();

    public BlackJackGame(BlackJackGameBuilder builder) {
        this.deck = builder.getDeck();
        this.gambler = builder.getGambler();
        this.dealer = builder.getDealer();
        this.gambler = (Gambler) gamblerFactory.createPlayer();
        this.dealer = (Dealer) dealerFactory.createPlayer();
    }

    public void startGame() {
        dealer.setHiddenCard(deck.dealCard());
        dealer.addCard(deck.dealCard());

        gambler.addCard(deck.dealCard());
        gambler.addCard(deck.dealCard());
    }

    public void playerHit() {
        gambler.addCard(deck.dealCard());
    }

    public void dealerPlay() {
        dealer.setStrategy(new HitBelowSeventeenStrategy());
        dealer.play(deck);
    }

    public String determineWinner() {
        int playerSum = gambler.getSum();
        int dealerSum = dealer.getSum();

        if (playerSum > 21) return "You lose!";
        if (dealerSum > 21) return "Dealer loses, you win!";
        if (playerSum == dealerSum) return "It's a tie!";
        if (playerSum > dealerSum) return "You win!";
        return "Dealer wins!";
    }

    public String getPlayerHand() {
        return handToString(gambler.getHand());
    }

    public String getDealerVisibleCard() {
        return dealer.getHand().get(0).toString();
    }

    public int getPlayerSum() {
        return gambler.getSum();
    }

    public int getDealerSum() {
        return dealer.getSum();
    }

    public String getDealerHand() {
        return handToString(dealer.getHand());
    }

    private String handToString(ArrayList<Card> hand) {
        StringBuilder sb = new StringBuilder();
        for (Card card : hand) {
            sb.append(card.toString()).append(" ");
        }
        return sb.toString().trim();
    }
}

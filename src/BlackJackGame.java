import java.util.ArrayList;

public class BlackJackGame {
    private Deck deck;
    private Player player;
    private Dealer dealer;

    public BlackJackGame() {
        deck = new Deck();
        player = new Player();
        dealer = new Dealer();
    }

    public void startGame() {
        dealer.setHiddenCard(deck.dealCard());
        dealer.addCard(deck.dealCard());

        player.addCard(deck.dealCard());
        player.addCard(deck.dealCard());
    }

    public void playerHit() {
        player.addCard(deck.dealCard());
    }

    public void dealerPlay() {
        dealer.revealHiddenCard();
        while (dealer.getSum() < 17) {
            dealer.addCard(deck.dealCard());
        }
    }

    public String determineWinner() {
        int playerSum = player.getSum();
        int dealerSum = dealer.getSum();

        if (playerSum > 21) return "You lose!";
        if (dealerSum > 21) return "Dealer loses, you win!";
        if (playerSum == dealerSum) return "It's a tie!";
        if (playerSum > dealerSum) return "You win!";
        return "Dealer wins!";
    }

    // Getters voor de hand en de som
    public String getPlayerHand() {
        return handToString(player.getHand());
    }

    public String getDealerVisibleCard() {
        return dealer.getHand().get(0).toString(); // Alleen de zichtbare kaart
    }

    public int getPlayerSum() {
        return player.getSum();
    }

    public int getDealerSum() {
        return dealer.getSum();
    }

    public String getDealerHand() {
        return handToString(dealer.getHand());
    }

    // Hulpmethode om de hand om te zetten naar een leesbare string
    private String handToString(ArrayList<Card> hand) {
        StringBuilder sb = new StringBuilder();
        for (Card card : hand) {
            sb.append(card.toString()).append(" ");
        }
        return sb.toString().trim();
    }
}

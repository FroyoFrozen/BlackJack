public class BlackJackGameFacade {

    private boolean gameOver;

    private BlackJackGame game;

    public BlackJackGameFacade() {
        this.game = new BlackJackGame();
    }

    public void startGame() {
        game.startGame();
        System.out.println("Game started!");
        displayPlayerHand();
        displayDealerVisibleCard();
    }

    public void playerHit() {
        game.playerHit();
        System.out.println("You chose to hit.");
        displayPlayerHand();
    }

    public boolean isPlayerBusted() {
        if (game.getPlayerSum() > 21) {
            playerBustedAnnouncement();
            return true;
        }
        return false;
    }

    public void playerBustedAnnouncement(){
        if (!gameOver){
            gameOver = true;
            System.out.println("Your hand exceeds 21. You lose!!!!");
        }
    }

    public void dealerPlay() {
        game.dealerPlay();
        System.out.println("Dealer's turn.");
        displayDealerHand();
    }

    public void determineWinner() {
        String result = game.determineWinner();
        System.out.println(result);
    }

    private void displayPlayerHand() {
        System.out.println("Your hand: " + game.getPlayerHand() + " (Total: " + game.getPlayerSum() + ")");
    }

    private void displayDealerVisibleCard() {
        System.out.println("Dealer's visible card: " + game.getDealerVisibleCard() + " (hidden)");
    }

    private void displayDealerHand() {
        System.out.println("Dealer's hand: " + game.getDealerHand() + " (Total: " + game.getDealerSum() + ")");
    }
}
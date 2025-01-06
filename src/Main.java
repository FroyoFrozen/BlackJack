import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Gamblers and Gamblettes!");
        Scanner scanner = new Scanner(System.in);
        BlackJackGame game = new BlackJackGame();

        while (true) {
            // Start the game for each round
            game.startGame();

            System.out.println("Your hand: " + game.getPlayerHand() + " (Total: " + game.getPlayerSum() + ")");
            System.out.println("Dealer's visible card: " + game.getDealerVisibleCard() + " (hidden)");

            // Player's turn: hit or stay
            while (game.getPlayerSum() <= 21) {
                System.out.println("Do you want to 'hit' or 'stay'?");
                String action = scanner.nextLine().toLowerCase();

                if (action.equals("hit")) {
                    game.playerHit();
                    System.out.println("Your new hand: " + game.getPlayerHand() + " (Total: " + game.getPlayerSum() + ")");
                } else if (action.equals("stay")) {
                    break;
                } else {
                    System.out.println("Invalid option. Please enter 'hit' or 'stay'.");
                }
            }

            if (game.getPlayerSum() > 21) {
                System.out.println("Your hand exceeds 21. You lose!");
            } else {
                // Dealer's turn
                game.dealerPlay();
                System.out.println("Dealer's hand: " + game.getDealerHand() + " (Total: " + game.getDealerSum() + ")");

                // Determine the winner
                String result = game.determineWinner();
                System.out.println(result);
            }

            break;
        }

        scanner.close();
    }
}

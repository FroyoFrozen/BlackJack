import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Gamblers and Gamblettes!");
        Scanner scanner = new Scanner(System.in);

        BlackJackGame game = new BlackJackGameBuilder()
                .setDeck(new Deck())
                .setGambler(new Gambler())
                .setDealer(new Dealer())
                .build();

        BlackJackGameFacade blackjack = new BlackJackGameFacade(game);
        blackjack.startGame();

        while (true) {
            System.out.println("Do you want to 'hit' or 'stay'?");
            String action = scanner.nextLine().toLowerCase();

            if (action.equals("hit")) {
                blackjack.playerHit();
                if (blackjack.isPlayerBusted()) break;
            } else if (action.equals("stay")) {
                break;
            } else {
                System.out.println("Invalid option. Please enter 'hit' or 'stay'.");
            }
        }

        if (!blackjack.isPlayerBusted()) {
            blackjack.dealerPlay();
            blackjack.determineWinner();
        }

        scanner.close();
    }
}
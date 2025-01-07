public class GamblerFactory implements PlayerFactory {
    @Override
    public Player createPlayer() {
        return new Gambler();
    }
}

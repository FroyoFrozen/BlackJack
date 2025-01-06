public class DealerFactory implements PlayerFactory{
    @Override
    public Player createPlayer() {
        return new Dealer();
    }
}

public class AceState implements AllCardsValueState {
    @Override
    public int getValue(int playerSum) {
        return playerSum > 21 ? 1 : 11;
    }
}

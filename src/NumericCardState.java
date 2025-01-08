public class NumericCardState implements AllCardsValueState {
    private final int value;

    public NumericCardState(int value) {
        this.value = value;
    }

    @Override
    public int getValue(int playerSum) {
        return value;
    }
}

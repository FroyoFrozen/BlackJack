public class Card {
    String value;
    String type;

    private AllCardsValueState state;



    public Card(String value, String type) {
        this.value = value;
        setState(value);
        this.type = type;
    }

    private void setState(String value) {
        if (value.equals("A")) {
            state = new AceState();
        } else if ("JQK".contains(value)) {
            state = new FaceCardState();
        } else {
            state = new NumericCardState(Integer.parseInt(value));
        }
    }

    public int getValue(int playerSum) {
        return state.getValue(playerSum);
    }

    public String toString() {
        return value + "-" + type;
    }

    public boolean isAce() {
        return value.equals("A");
    }

    public String getImagePath() {
        return "./cards/" + toString() + ".png";
    }
}

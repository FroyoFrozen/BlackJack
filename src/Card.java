public class Card {
    String value;
    String type;

    public Card(String value, String type) {
        this.value = value;
        this.type = type;
    }

    public String toString() {
        return value + "-" + type;
    }

    public int getValue(int playerSum) {
        if ("AJQK".contains(value)) {
            if (value.equals("A")) {
                if (playerSum > 21) {
                    return 1;
                } else {
                    return 11;
                }
            }
            return 10;
        }
        return Integer.parseInt(value); // 2-10
    }

    public boolean isAce() {
        return value.equals("A");
    }

    public String getImagePath() {
        return "./cards/" + toString() + ".png";
    }
}

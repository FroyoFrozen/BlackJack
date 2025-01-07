public class HitBelowSeventeenStrategy implements DealerStrategy {
    @Override
    public boolean shouldHit(int dealerSum) {
        return dealerSum < 17;
    }
}

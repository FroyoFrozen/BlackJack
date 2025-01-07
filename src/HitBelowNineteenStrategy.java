public class HitBelowNineteenStrategy implements DealerStrategy {
    @Override
    public boolean shouldHit(int dealerSum) {
        return dealerSum < 19;
    }
}
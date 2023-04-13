public class RewardValue {
    private final double cash;
    private final double MILES_TO_CASH_RATE = 0.0035;
    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(int miles) {
        this.cash = miles * MILES_TO_CASH_RATE;
    }

    public double getCashValue() {
        return this.cash;
    }

    public int getMilesValue() {
        return (int) (this.cash / MILES_TO_CASH_RATE);
    }

}

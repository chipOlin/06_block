package Bank;

public class CardAccount extends BankAccount {
    private static final double PERCENT = 0.01;

    public CardAccount(double sumOnAcc) {
        super(sumOnAcc);
    }

    @Override
    public void take(double amountToTake) {
        double commission = amountToTake * PERCENT;
        super.take(amountToTake + commission);
    }
}

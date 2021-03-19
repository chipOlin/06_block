public class CardAccount extends BankAccount {
    public static final double PERCENT = 0.01;

    CardAccount(double sumOnAcc) {
        super(sumOnAcc);
    }

    @Override
    public void take(double amountToTake) {
        double commission = amountToTake * PERCENT;
        super.take(amountToTake + commission);
    }
}

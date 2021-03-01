public class CardAccount extends BankAccount {
    public void take(double amountToTake) {
        double commission = amountToTake * 0.01;
        super.take(amountToTake + commission);
    }
}

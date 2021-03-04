public class BankAccount {
  private double amount;

  public double getAmount() {
    return amount;
  }

    public void put(double amountToPut) {
        if (amountToPut > 0) {
            amount += amountToPut;
        }
    }

  public void take(double amountToTake) {
    if (amountToTake > 0 && amountToTake <= amount) amount -= amountToTake;
  }

  public boolean send(BankAccount receiver, double amount) {
    double amountSenderBeforeSend = this.getAmount();
    this.take(amount);
    if (this.getAmount() != amountSenderBeforeSend) {
      receiver.put(amount);
      return true;
    } else {
      return false;
    }
  }
}

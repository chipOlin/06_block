public class PhysicalPerson extends Client {
    PhysicalPerson() {
        info = "Пополнение и списание происходит без комиссии.";
    }

    @Override
    public void put(double amountToPut) {
        if (amountToPut > 0) super.put(amountToPut);
    }

    @Override
    public void take(double amountToTake) {
        double amount = getAmount();
        if (amountToTake > 0 && amountToTake <= amount) super.take(amountToTake);
    }
}

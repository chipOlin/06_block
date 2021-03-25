public class LegalPerson extends Client {
    LegalPerson() {
        info = "Пополнение происходит без комиссии.\n\tСнятие с комиссией 1%.";
    }

    @Override
    public void put(double amountToPut) {
        if (amountToPut > 0) super.put(amountToPut);
    }

    @Override
    public void take(double amountToTake) {
        double amount = getAmount();
        double totalAmount = amountToTake + (amountToTake * PERCENT);
        if (totalAmount > 0 && totalAmount <= amount) super.take(totalAmount);
    }
}

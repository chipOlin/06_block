public class IndividualBusinessman extends Client {
    IndividualBusinessman() {
        info = "Пополнение с комиссией 1%, если сумма меньше 1 000 рублей.\n\tПополнение с комиссией 0,5%, если сумма больше либо равна 1 000 рублей.\n\tСписание происходит без комиссии.";
    }

    @Override
    public void put(double amountToPut) {
        double totalAmount;
        if (amountToPut > 0) {
            if (amountToPut < 1000) totalAmount = amountToPut - (amountToPut * PERCENT);
            else totalAmount = amountToPut - (amountToPut * (PERCENT / 2));
            super.put(totalAmount);
        }
    }

    @Override
    public void take(double amountToTake) {
        double amount = getAmount();
        if (amountToTake > 0 && amountToTake <= amount) super.take(amountToTake);
    }
}

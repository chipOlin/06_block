package Bank;

import java.time.LocalDate;

public class DepositAccount extends BankAccount {
    private LocalDate lastIncome;

    public DepositAccount(double sumOnAcc) {
        super(sumOnAcc);
    }

    @Override
    public void put(double amountToPut) {
        setLastIncome(LocalDate.now());
        super.put(amountToPut);
    }

    @Override
    public void take(double amountToTake) {
        LocalDate lastIncomePlusMonth = getLastIncome().plusMonths(1);
        if (LocalDate.now().isAfter(lastIncomePlusMonth)) super.take(amountToTake);
    }

    public void setLastIncome(LocalDate lastIncome) {
        this.lastIncome = lastIncome;
    }

    public LocalDate getLastIncome() {
        return lastIncome;
    }
}

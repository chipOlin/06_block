public abstract class Client {
    private double amount;
    protected String info = "";
    protected final static double PERCENT = 0.1;

    void AccountInfo() {
        System.out.println("Информация о счёте:");
        System.out.println("\t" + info);
        System.out.println("Баланс: " + amount + " рублей.");
    }

    public double getAmount() {
        return amount;
    }

    public void put(double amountToPut) {
        amount += amountToPut;
    }

    public void take(double amountToTake) {
        amount -= amountToTake;
    }
}

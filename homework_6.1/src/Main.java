import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        //System.out.println(account1.getAmount());
        //account1.put(1000);
        System.out.println(account1.getAmount());
        account1.take(300);
        System.out.println("a1 = " + account1.getAmount());

        System.out.println("----------------------");

        CardAccount account2 = new CardAccount(1000);
        //BankAccount account2 = new CardAccount(1000);
        //account2.put(1000);
        System.out.println(account2.getAmount());
        account2.take(100);
        System.out.println("a2 = " + account2.getAmount());
        System.out.println(account2.send(account1, 30));
        System.out.println("a1 = " + account1.getAmount());
        System.out.println("a2 = " + account2.getAmount());
        System.out.println(account1.send(account2, 50));
        System.out.println("a1 = " + account1.getAmount());
        System.out.println("a2 = " + account2.getAmount());

        System.out.println("----------------------");

        DepositAccount account3 = new DepositAccount(1500);
        //BankAccount account3 = new DepositAccount(1500);
        //account3.put(1500);
        System.out.println(account3.getAmount());
        System.out.println(account3.getLastIncome());
        account3.setLastIncome(LocalDate.of(2021, 2, 1));
        account3.take(500);
        account3.send(account2, 200);
        System.out.println(account3.getAmount());
        System.out.println(account2.getAmount());
    }
}

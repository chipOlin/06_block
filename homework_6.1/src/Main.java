public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        System.out.println(account1.getAmount());
        account1.put(1000);
        System.out.println(account1.getAmount());
        account1.put(-10);
        System.out.println(account1.getAmount());
        account1.take(2000);
        System.out.println(account1.getAmount());
        account1.take(1000);
        System.out.println(account1.getAmount());
        System.out.println("----------------------");
        CardAccount account2 = new CardAccount();
        account2.put(1000);
        System.out.println(account2.getAmount());
        account2.take(100);
        System.out.println(account2.getAmount());
    }
}

public class Main {
    public static void main(String[] args) {
        Client cl3 = new IndividualBusinessman();
        Client cl2 = new LegalPerson();
        Client cl1 = new PhysicalPerson();

        cl3.AccountInfo();
        cl3.put(-200);
        cl3.put(900);
        cl3.AccountInfo();
        cl3.take(3000);
        cl3.take(700);
        cl3.AccountInfo();
    }
}

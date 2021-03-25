public class Main {
    public static void main(String[] args) {
        Client cl3 = new IndividualBusinessman();
        Client cl2 = new LegalPerson();
        Client cl1 = new PhysicalPerson();

        cl1.AccountInfo();
        cl1.put(-200);
        cl1.put(1200);
        cl1.AccountInfo();
        cl1.take(3000);
        cl1.take(700);
        cl1.AccountInfo();
    }
}

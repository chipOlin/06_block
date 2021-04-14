

public class CompanyTest {
    public static void main(String[] args) {
        Company d = new Company();
        d.hireAll('o', 2);
        d.hireAll('m', 50);
        d.hireAll('t', 2);
        System.out.println(d.getIncome());

        //List<Employee> employees = new ArrayList<>();
        System.out.println(d.getTopSalaryStaff(3).size());
    }
}

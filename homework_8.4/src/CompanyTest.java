import java.util.List;

public class CompanyTest {
    public static void main(String[] args) {
        Company d = new Company();
        d.hireAll('o', 2);
        d.hireAll('m', 80);
        d.hireAll('t', 2);
        System.out.println(d.getIncome());

        List<Employee> topSalaryStaff = d.getTopSalaryStaff(5);
        print(topSalaryStaff);
        System.out.println();
        List<Employee> lowSalaryStaff = d.getLowestSalaryStaff(5);
        print(lowSalaryStaff);
        d.fire(50);
        System.out.println();
        topSalaryStaff = d.getTopSalaryStaff(5);
        print(topSalaryStaff);
        System.out.println();
        lowSalaryStaff = d.getLowestSalaryStaff(5);
        print(lowSalaryStaff);
    }

    public static void print(List<Employee> list) {
        for (Employee employee : list) {
            System.out.println(employee.getMonthSalary());
        }
    }
}

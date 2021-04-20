import java.util.ArrayList;
import java.util.List;

public class CompanyTest {
    public static void main(String[] args) {
        Company d = new Company();

        // - Add Operators
        //d.hire(new Operator());
        List<Employee> operators = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            operators.add(new Operator());
        }
        d.hireAll(operators);

        // - Add Managers
        //d.hire(new Manager(d));
        List<Employee> managers = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            managers.add(new Manager(d));
        }
        d.hireAll(managers);

        // - Add TopManagers
        //d.hire(new TopManager(d));
        List<Employee> topManagers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            topManagers.add(new TopManager(d));
        }
        d.hireAll(topManagers);

        d.print();

        List<Employee> topSalaryStaff = d.getTopSalaryStaff(5);
        print(topSalaryStaff);
        System.out.println("----------");
        List<Employee> lowSalaryStaff = d.getLowestSalaryStaff(5);
        print(lowSalaryStaff);
        d.fire(50);
        System.out.println("**********");
        d.print();
        System.out.println("**********");
        topSalaryStaff = d.getTopSalaryStaff(5);
        print(topSalaryStaff);
        System.out.println("----------");
        lowSalaryStaff = d.getLowestSalaryStaff(5);
        print(lowSalaryStaff);
    }

    private static void print(List<Employee> list) {
        for (Employee employee : list) {
            System.out.println(employee.getMonthSalary());
        }
    }
}

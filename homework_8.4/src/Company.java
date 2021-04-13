import java.util.ArrayList;
import java.util.List;

public class Company {
    private double income;
    List<Company> staff = new ArrayList<>();

    double salaryOperator = 30000;
    double salaryManager = 50000;
    double salaryTopManager = 80000;
    double bonusForManager = 0.05;
    double bonusForTopManager = 1.5;
    double incomeForBonusTopManagers = 10000000;

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income += income;
    }

    public void hire(char c) {
        hireAll(c, 1);
    }

    public void hireAll(char c, int num) {
        for (int i = 0; i < num; i++) {
            switch (c) {
                case 'o' -> staff.add(new Operator(this));
                case 'm' -> staff.add(new Manager(this));
                case 't' -> staff.add(new TopManager(this));
            }
        }
    }

    public void fire() {

    }

    public List<Employee> getTopSalaryStaff(int count) {
        return null;
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        return null;
    }
}

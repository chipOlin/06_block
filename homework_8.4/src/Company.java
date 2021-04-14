import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Company {
    private double income;
    List<Employee> staff = new ArrayList<>();

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
        /*TreeSet<Employee> salaries = new TreeSet<>(new TopSalary());
        for (Employee e : staff) {
            salaries.add(e);
        }*/
        /*
        for (int index = 0; index < staff.size(); index++) {
            //System.out.println(staff.get(index).getClass());
            if (staff.get(index) instanceof Operator) {
                System.out.println(((Operator) staff.get(index)).getMonthSalary());
            } else if (staff.get(index) instanceof Manager) {
                System.out.println(((Manager) staff.get(index)).getMonthSalary());
            } else {
                System.out.println(((TopManager) staff.get(index)).getMonthSalary());
            }
        }*/
        return null;
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        return null;
    }
}

class TopSalary implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.getMonthSalary(), o2.getMonthSalary());
    }
}

class LowSalary implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o2.getMonthSalary(), o1.getMonthSalary());
    }
}
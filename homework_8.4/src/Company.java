import java.util.*;

public class Company {
    private double income;
    private final List<Employee> staff = new ArrayList<>();

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income += income;
    }

    public void hire(Employee employee) {
        staff.add(employee);
    }

    public void hireAll(List<Employee> list) {
        staff.addAll(list);
    }

    public void fire(int percent) {
        int num = (int) (staff.size() * ((double) percent)/100);
        for (int i = 0; i < num; i++) {
            staff.remove((int) (Math.random() * staff.size()));
        }
    }

    public List<Employee> getTopSalaryStaff(int count) {
        List<Employee> sortStaff = new ArrayList<>(staff);
        List<Employee> salaries = new ArrayList<>();
        sortStaff.sort(new TopSalary());
        for (int i = 0; i < count; i++) salaries.add(sortStaff.get(i));
        return salaries;
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        List<Employee> sortStaff = new ArrayList<>(staff);
        List<Employee> salaries = new ArrayList<>();
        sortStaff.sort(new LowSalary());
        for (int i = 0; i < count; i++) salaries.add(sortStaff.get(i));
        return salaries;
    }

    public void print() {
        /*for (Employee employee : staff) {
            System.out.println(employee.getMonthSalary());
        }*/
        System.out.println("staff numbers - " + staff.size());
        System.out.println("income - " + getIncome());
    }
}

class TopSalary implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o2.getMonthSalary(), o1.getMonthSalary());
    }
}

class LowSalary implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.getMonthSalary(), o2.getMonthSalary());
    }
}
import java.util.*;

public class Company {
    private double income;
    public List<Employee> staff = new ArrayList<>();

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

    public void fire(int percent) {
        int num = (int) (staff.size() * ((double) percent)/100);
        for (int i = 0; i <= num; i++) {
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
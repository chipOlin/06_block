public class TopManager extends Company implements Employee {
    Company company;
    double salary;

    TopManager(Company company) {
        this.company = company;
        salary = (int)(Math.random() * 10000) + 60000;
        if (company.getIncome() > 10000000) salary += salary * 1.5;
        System.out.println("t - " + salary);
    }

    @Override
    public double getMonthSalary() {
        return salary;
    }
}

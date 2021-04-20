public class Manager implements Employee {
    Company company;
    double salary;

    Manager(Company company) {
        this.company = company;
        double earn = (int)(Math.random() * 25000) + 115000;
        salary = (int)(Math.random() * 10000) + 50000 + (earn * 0.05);
        //System.out.println("m - " + salary);
        company.setIncome(earn);
    }

    @Override
    public double getMonthSalary() {
        return salary;
    }
}

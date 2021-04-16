public class Operator extends Company implements Employee {
    Company company;
    double salary;

    Operator(Company company) {
        this.company = company;
        salary = (int)(Math.random() * 10000) + 30000;
        //System.out.println("o - " + salary);
    }

    @Override
    public double getMonthSalary() {
        return salary;
    }
}

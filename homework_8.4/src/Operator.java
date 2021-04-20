public class Operator implements Employee {
    //Company company;
    double salary;

    Operator() {
        //this.company = company;
        salary = (int)(Math.random() * 10000) + 30000;
        //System.out.println("o - " + salary);
    }

    @Override
    public double getMonthSalary() {
        return salary;
    }
}

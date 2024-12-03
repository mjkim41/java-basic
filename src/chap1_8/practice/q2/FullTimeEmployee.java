package chap1_8.practice.q2;

public class FullTimeEmployee extends Employee {

    private double salary;

    public FullTimeEmployee(double salary) {
        super();
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return salary;
    }
}

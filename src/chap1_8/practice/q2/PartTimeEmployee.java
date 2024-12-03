package chap1_8.practice.q2;

public class PartTimeEmployee extends Employee {

    private double hoursWorked;
    private double hourlyWage;

    public PartTimeEmployee(double hourlyWage, double hoursWorked) {
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
    }

    @Override
    public double calculatePay() {
        return hourlyWage * hoursWorked;
    }
}

package chap1_7.inherit.example.hr;

public class Employee {

    public String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println("일반 직원이 일합니다");
    }

    public double getSalary() {
        return this.salary;
    }

}

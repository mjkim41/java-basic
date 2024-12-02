package chap1_7.inherit.example.hr;

import java.text.DecimalFormat;

public class Manager extends Employee{

    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("관리자가 팀을 관리합니다.");
    }

    public String getTotalCompensation() {
        // 기본 급여 + 보너스 불러오기
        double totalCompensation =  getSalary() + bonus;
        DecimalFormat df = new DecimalFormat("AUD #,###.00");
        return df.format(totalCompensation);
    }
}

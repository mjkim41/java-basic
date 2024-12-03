package chap1_8.practice.q2;

public class PayRollManager {

     public PayRollManager() {}

    public void printPay(Employee employee) {
         double pay = employee.calculatePay();
        System.out.printf("%s의 월급은 %.2f입니다.", employee, pay);
    }
}

package chap1_8.practice.q2;

public class Main {

    public static void main(String[] args) {

        PayRollManager manager = new PayRollManager();
        manager.printPay(new FullTimeEmployee(20000));
    }
}

package chap1_3;

public class BankAccountMain {

    public static void main(String[] args) {

        BankAccount mj = new BankAccount("김미정");
        mj.deposit(20000.0);
        mj.withdraw(10000.0);
        mj.displayBalance();
    }
}

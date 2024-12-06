package chap1_7.inherit.example.bank;

public class SavingsAccount extends BankAccount{

    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    // !! 예금 기능
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            double interest = amount * interestRate;
            super.deposit(amount + interest); // !! this아닌 super
            System.out.printf("이자 %.2f원 추가 완료", interest);
        }
    }
}
package chap1_7.inherit.example.bank;

public class Main {

    public static void main(String[] args) {

        SavingsAccount mySavingAccount = new SavingsAccount("A001", 5000, 0.03);

        mySavingAccount.deposit(100000);
        mySavingAccount.displayBalance();

        mySavingAccount.withdraw(100, "USD");
        mySavingAccount.displayBalance();
    }
}

package chap1_3;

public class BankAccount {

    int account;
    String owner;
    double balance = 0;

    // 생성자
    BankAccount(String ownerName) {
        owner = ownerName;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.printf("%1.2f원 입금 완료.\n 잔액: %1.2f\n", amount, balance);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.printf("%1.2f원 입금 완료.\n 잔액: %1.2f\n", amount, balance);
    }

    void displayBalance() {
        System.out.printf("현재 잔액은 %1.2f원 입니다.", balance);
    }

}

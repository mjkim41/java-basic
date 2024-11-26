package chap1_3.practice;

public class BankAccount {

    String accountNumber; // 계좌번호
    String owner; // 계좌 소유주명
    double balance; // 잔고


    // 입금 기능
    void deposit(double money) {
        balance += money;
        // %f : 소수점 6자리까지만 출력
        System.out.printf("%.0f원이 입금되었습니다. 현재 잔고: %.0f원\n", money, balance);
    }

    // 출금 기능
    void withdraw(double money) {
        if (money > balance) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        balance -= money;
        System.out.printf("%.0f원이 출금되었습니다. 현재 잔고: %.0f원\n", money, balance);
    }

    // 잔고 출력
    void displayBalance() {
        System.out.println("현재 잔고: " + (int) balance);
    }

    // 계좌 이체
    void transfer(BankAccount takenAccount, int money) {
        // 내 계좌의 잔액에 받은 돈을 추가
        balance -= money;
        // 상대방계좌에서는 받은 돈을 감소
        takenAccount.balance += money;
    }

}
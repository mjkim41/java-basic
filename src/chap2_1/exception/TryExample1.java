package chap2_1.exception;

public class TryExample1 {

    public static void main(String[] args) {

        try {
            int n1 = 10;
            int n2 = 0;

            System.out.println("나눗셈 시작!");

            int result = n1 / n2;
            System.out.printf("%d / %d = %d\n", n1, n2, result);
        } catch (Exception e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        System.out.println("나눗셈 종료!");

    }
}

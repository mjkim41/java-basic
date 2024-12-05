package chap2_1.exception;

import java.util.Scanner;

public class TryExample2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("정수1: ");
            // 숫자를 문자열롷 입력 받아서
            String str1 = sc.nextLine();
            // 그 숫자를 숫자데이터타입으로 변환
            int n1 = Integer.parseInt(str1);

            System.out.println("정수2: ");
            // 숫자를 문자열롷 입력 받아서
            String str2 = sc.nextLine();
            // 그 숫자를 숫자데이터타입으로 변환
            int n2 = Integer.parseInt(str2);

            int result = n1 / n2;
            System.out.println("result = " + result);
        } catch (NumberFormatException e) {
            /*
              Exception: 예외의 메타데이터를 저장하는 클래스

               Object
                  |
              Throwable
                  |
              Exception

             */
            System.out.println(e.getMessage());
            // !! 예외 상황에서 나오는 로그 볼 수 있음
            e.printStackTrace();
            System.out.println("정수 정확하게 입력하라 캬캬");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누지 마라 호롤룰루");
        }

        System.out.println("프로그램 정상 종료");
    }
}

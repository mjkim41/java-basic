package chap2_1.exception;

import java.util.Scanner;

public class TryExample3InputUtil {

    private static Scanner sc = new Scanner(System.in);

    // 문자열 입력을 처리하는 메서드
    public static String inputStr(String message) {
        System.out.print(message);
        return sc.nextLine();
    }
    // 정수 입력을 처리하는 메서드
    public static int inputInt(String message) {
        while (true) {
            try {
                String str = inputStr(message);
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("정수 숫자로 정확히 입력하라");
            }
        }
    }

}

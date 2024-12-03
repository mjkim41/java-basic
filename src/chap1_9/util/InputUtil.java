package chap1_9.util;

import java.util.Scanner;

// 콘솔 입력처리를 쉽게 도와주는 클래스
public class InputUtil {

    // !! 제한자 확인
    private static Scanner sc = new Scanner(System.in);

    public static String inputStr(String message) {
        System.out.println(message);
        return sc.nextLine();
    }

    // 정수 입력을 처리하는 메서드
    public static int inputInt(String message) {
        String str = inputStr(message);
        return Integer.parseInt(str);
    }
}

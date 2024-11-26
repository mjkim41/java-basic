package chap1_3;

import java.util.Scanner;

public class StringCompare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String inputName = sc.nextLine();
        String myName = "홍길동";

        System.out.println("inputName = " + inputName);
        System.out.println("myName = " + myName);

        // !! 잘못된 주소값 비교
        if (inputName == myName) {
            System.out.println("두 이름이 같습니다.");
        } else {
            System.out.println("두 이름이 다릅니다.");
        }

        // 주소값 비교
        if (inputName.equals(myName)) {
            System.out.println("두 이름이 같습니다.");
        } else {
            System.out.println("두 이름이 다릅니다.");
        }

        // a = [ '홍', '길', '동' ]
        // b = [ '홍', '길', '동' ]

    }
}
package chap2_1.exception;



public class TryExample3 {

    public static void main(String[] args) {

        int age = TryExample3InputUtil.inputInt("나이를 입력하세요\n");
        System.out.println("age : " + age);
        System.out.println("종료");
    }
}

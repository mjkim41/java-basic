package chap2_1.exception;

public class FinallyExample {

    public static void main(String[] args) {

        String[] pets = {"멍멍이", "야옹이", "호냥이"};

        for (int i = 0; i < 4 ; i++) {
            try {
                System.out.println(pets[i] + " 키우고 싶어요.");
            } catch (Exception e) {
                System.out.println("그런 건 없어요");
            } finally {
                // 예외 발생 여부 상관 없이 실행
                // 일반적으로 메모리 정리 차원에서 사용하는 경우가 많음
                System.out.println("애완동물 화이팅");
            }
        }

        System.out.println("종료~~");
    }
}

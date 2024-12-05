package chap2_2.lang;

public class Wrapper {

    public static void main(String[] args) {
        int a = 10;

        // 박싱 : 빈번하게 쓰이는 객체들을 쉽게 쓸 수 있게 문법적으로 처리
//      String s = new String(new char[] {'a', 'b', 'c'});
        String s = "abc";

//        Integer b = new Integer(10);
        Integer b = 10;
        Byte x1 = 10;
        Short x2 = 10;
        Integer x3 = 10;
        Long x4 = 40L;
        Float x5 = 5.5f;
        Double x6 = 5.6;
        Boolean x7 = false;

        System.out.println("b = " + b);
    }

}

package chap1_9.static_;

public class Main {

    public static void main(String[] args) {

    Count c1 = new Count();
    Count c2 = new Count();
    Count c3 = new Count();

    c1.y = 10;
    c2.y++;


    System.out.println("c1.y = " + c1.y);
    System.out.println("c2.y = " + c2.y);

    // !! c1뿐만 아니라 c2의 값도 함께 바뀜
    // => 아래처럼 할 필요 없이, Count.x = 99; 이런식으로 만들면 됨

    /* c1.x = 99;
       c2.x -= 92;
       c3.x = 5000;
    */
    System.out.println("c1.x = " + c1.x);
    System.out.println("c2.x = " + c2.x);
    System.out.println("c3.x = " + c3.x);

    // static은 객체 생성없이 사용 가능, static 아니면 객체 생성하여야 함
    Count.m1();
    // Count.m2();





    }


}

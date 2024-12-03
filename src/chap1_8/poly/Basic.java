package chap1_8.poly;

// !!  클래스 밖에 클래스를 만들 수도 있음.
// 이 때, 파일명과 동일한 클래스가 포함되어아 있어야 하고,
// 감싸는 CLASS는 DEFAULT  밖에 안 됨

/*

    Object
      |
      A
    /   \
   B     C   (!! 형제는 상속관계가 없음)
   |     |
   D     E


*/

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class Basic {

    public A a = new A(); // !! 여긴 필드

    public static void main(String[] args) {

        // 다형성
        A x1 = new A();
        A x2 = new B();
        A x3 = new C();
        A x4 = new D();
        Object x5 = new E();



    }

}

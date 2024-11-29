package chap1_6.modi.pac1;

// class에는 접근 제한을 public과 default만 적용할 수 있다
public class A {

    // 필드(public, default, private)
    public int f1;
    int f2;
    private int f3;

    // 생성자
    public A() {
        this(10.99);
        f1 = 1;
        f2 = 2;
        f3 = 3;
        m1();
        m2();
        m3();
    }
    A(int a) {}
    private A(double b) {}

    // 메서드
    public void m1(
//            public int x = 10; // 지역 변수에는 접근제어자 사용 불가
    ) {}
    void m2() {}
    private void m3() {}


}

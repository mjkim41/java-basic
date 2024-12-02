package chap1_7.protected_.pac1;

public class B {

    void test() {
        A a = new A();
        a.f1Protected = 10;
        a.f2Default = 20;

        a.m1Protected(); a.m2Default();

        new A(111);
        new A("dddd");
    }
}

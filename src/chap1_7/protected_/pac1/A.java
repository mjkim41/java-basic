package chap1_7.protected_.pac1;

public class A {

    protected int f1Protected;
    int f2Default; // default, package-private

    public A() {
        System.out.println("public");
    }
    protected A(int a) {
        System.out.println("protected");
    }

    A(String s) {}

    protected void m1Protected() {
        System.out.println("protected");}
    void m2Default() {}

    void test() {
        f1Protected = 10; f2Default = 20;
        m1Protected(); m2Default();
        new A(); new A(1); new A("dd");
    }
}

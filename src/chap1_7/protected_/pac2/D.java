package chap1_7.protected_.pac2;

import chap1_7.protected_.pac1.A;

public class D extends A {

    void test() {
//        A a = new A(100); // !!protected : 생성자를 통해서만 접근 가능
//        a.f1 = 200; // !!protected : 생성자를 통해서만 접근 가능
    }


    D() {
//        super("hello"); // default
        super(1); // protected


        super.f1Protected = 10; // protected
//        super.f2Default = 10; // default

        super.m1Protected(); // protected
//        super.m2(); // default
    }
}

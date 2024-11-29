package chap1_6.modi.pac2;

import chap1_6.modi.pac1.A;

public class C {

    C() {
        A a = new A(); // public
//        new A(10); // default
//        new A(5.5); // private

        a.f1 = 50;
//        a.f2 = 30;
//        a.f3 = 10;

        a.m1();
//        a.m2();
//        a.m3();
    }
}

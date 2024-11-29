package chap1_6.modi.pac1;

public class B {

    B() {
        A aa = new A(); // public
        A ab = new A(10); // default
//    A ac = new A(10.99); // private

        aa.f1 = 10; // public
        aa.f2 = 20; // default
//        aa.f3 = 30; // prviate

        aa.m1();
        aa.m2();
//        aa.m3();  // private
    };

}

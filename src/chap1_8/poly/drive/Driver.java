package chap1_8.poly.drive;

import org.w3c.dom.ls.LSOutput;

public class Driver {

    // 한 종류의 차 밖에 안 됨
    /*
    public void drive(Sonata car) {
        System.out.println("운전 시작");
        car.accelerate();
    }
    */

    public void drive(Car car) {
        System.out.println("운전 시작");
        car.accelerate();
    }

}

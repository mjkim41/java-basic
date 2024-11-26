package chap1_3.practice;

public class CarMain {

    public static void main(String[] args) {

        Car myCar = new Car("테슬라 모델X", "실버");
        myCar.accelerate(40);
        myCar.accelerate(50);
        myCar.brake(30);

        myCar.displaySpeed();
    }
}
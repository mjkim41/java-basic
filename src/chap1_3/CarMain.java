package chap1_3;

public class CarMain {

    public static void main(String[] args) {

        Car morning = new Car("모닝");
        morning.displaySpeed();
        morning.accelerate(60);
        morning.brake(20);
        morning.displaySpeed();

    }

}

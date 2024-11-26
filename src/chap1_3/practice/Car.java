package chap1_3.practice;

import java.time.LocalDate;

public class Car {

    // 필드(속성)
    String model;
    String color;
    int year;
    int speed;

    // 자동차가 생성될 때 수행할 일들
    Car(String modelName, String colorName) {
        model = modelName;
        color = colorName;
        year = LocalDate.now().getYear(); // !! LocalDate.new().getYear() = 현재날짜
//        speed = 0;
    }


    void accelerate(int increment) {
        speed += increment;
    }
    void brake(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
    }
    void displaySpeed() {
        System.out.printf("현재 속도는 %dkm/h입니다.\n", speed);
    }
}
package chap1_3;

public class Car {

    String company;
    String model;

    int currentSpeed;
    boolean isOn;

    Owner owner;


    // 기능
    // 시동을 켜는 기능
    void powerOn() {
        if (isOn) {
            System.out.println(model + "의 시동이 이미 걸려있습니다.");
            return;
        }
        isOn = true;
        System.out.println(model + "의 시동이 걸렸습니다.");
    }

    // 시동을 끄는 기능
    void powerOff() {
        if (!isOn) {
            System.out.println("시동이 걸려있지 않습니다.");
            return;
        }
        isOn = false;
        System.out.println("시동이 꺼졌습니다.");
    }
    //  악셀 기능
    void accelerate(int increment) {
        currentSpeed += increment;
        System.out.printf("%d 증속.\n현재 속도: %dkm/h\n", increment, currentSpeed);
    }
    // 감속 기능
    void brake(int decrement) {
        currentSpeed -= decrement;
        System.out.printf("%d 감속.\n현재 속도: %dkm/h\n", decrement, currentSpeed);
    }
    void displaySpeed() {
        System.out.printf("현재 속도: $%dkm/h\n", currentSpeed);
    }

    // 생성자 정의
    Car(String modelName) {
        model = modelName;
    }

}

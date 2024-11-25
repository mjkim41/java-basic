package chap1_3;

// 자동차 설계도
public class Vehicle {

    // 속성(필드) 정의

    // 일반 속성 - 일반적으로 잘 안바뀜
    // 제조사
    String company;

    // 모델명
    String model;

    // 상태 속성 - 수시로 변하는 속성

    // 현재 속도
    int currentSpeed;
    // 시동 여부
    boolean isOn;

    // !! 컴포지션(포함) 속성 - 객체가 객체를 중첩한 형태
    /*
        {
            company: "현대",
            model: "포터",
            currentSpeed: 0,
            isOn: false,
            owner: {
                name: '홍길동',
                registerDate: '2024-11-30'
            }
        }
     */
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
    // 주행기능
    void accelerate() {
        System.out.printf("%s 자동차가 주행을 시작합니다.\n", model);
        currentSpeed += 20;
        System.out.printf("현재 속도: %dkm/h\n", currentSpeed);
    }

    // 생성자 정의
    Vehicle(String modelName) {
        model = modelName;
    }

    // !!!  변수랑 필드는 다름 !!!!

}

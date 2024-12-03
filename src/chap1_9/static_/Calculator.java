package chap1_9.static_;

public class Calculator {



    // 색상에는 static 붙이면 안 됨. 그럼 모든 계산기의 색깔이 똑같아 짐
    String color; // 계산기 색상
    static double pi; // 원주율

    // 계산기에 커스텀 색상을 추가하는 메서드
    // !! static 붙이면 안 됨. 왜? 어떤 계산기에 색깔을 줄 지 정해야 되니까
    void customColorize() {
        this.color = color;
    }

    // 원의 넓이를 계산하는 메서드
    static double calcArea(int r) {
        return pi * r * r;
    }
}

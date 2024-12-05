package chap2_3.generic;

public class AppleBasket {

    // 원래는 Apple[]이 맞는데 예시를 위해서 Apple로 함
    private Apple apple;

    // apple이 private이니까 getter, setter 만듬
    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }
}

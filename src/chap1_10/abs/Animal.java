package chap1_10.abs;

// !! 추상클래스 : 상속 하위 클래스의 타입일치를 위한 껍데기 (객체 생성 불가)
public abstract class Animal {
    // !! 추상 메서드 : 오버라이딩을 위한 시그니처만 적어두는 메서드
    // 자식 클래스들에게 오버라이딩을 강요한다.
    public abstract void eat();

    // 이 설계도를 사용할 때 반드시 있어야할 기능들을 강요할 수 있다.
    public abstract void sleep();
}

package chap1_10.inter.phone;

public interface SmartPhone {



    // !!필드는 상수만 가질 수 있음
    // (public static final 안 쓰더라도 암묵적으로 public static final임)
    // 이유는 velog에 저장해두었음
    int a = 3;

    // 카메라 기능
    public void camera();

    // 충전 기능
    public void charge();

    // 인터넷 기능
    public void internet();
}

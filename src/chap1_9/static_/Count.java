package chap1_9.static_;

public class Count {

    /* 사용제한자 (usage modifier)
      1. static
       - 모든 객체가 공유하는 데이터(인스턴스마다 값이 다르지 않은 것)
         => 따라서, 객체 생성없이 사용 가능한 것
       - 이 값이나 기능이 객체마다 달라야 할 필요가 있는지, 아니면 모든 객체가 공유할 필요가 있는지에 따라 결정하면 됩니다.
       - 필드,메서드, 내부 클래스에 사용 가능
         =>  클래스, 생성자에는 못붙임
           -> 왜? 클래스 자체는 객체 인스턴스를 만들기 위한 템플릿이기 때문에,
                  클래스 자체를 정적으로 만들 필요가 없음.
           -> 왜?  생성자는 객체가 인스턴스화될 때 호출되는 특별한 메서드임
        - static은 클래스 메타데이터를 저장하는 공간에 저장됨(각 개체가 생성되는 게 아니라)
      2. final -
      3. abstract

     */
    static int x;
    int y;

    static void m1() {
        System.out.println("Static 메서드 콜");
        // !! static은 this 없음
        // System.out.println(this);

        // !! => 따라서, static 메서드 안에서는 동적 참조 불가
        System.out.println("x = " + x);
        // System.out.println("y = " + y);
    }

    void m2() {
        System.out.println("Instance 메서드 콜");

        // !! 반면, 동적 메서드 안에서는 static 참조 가능
        System.out.println("x = " + x);
        System.out.println("x = " + y);
    }

}

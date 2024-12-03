package chap1_8.poly.casting;

public class Main {

    public static void main(String[] args) {

        Child child = new Child();
        child.c1 = 59;
        child.p1 = 200;


        /*
          타입을 업캐스팅 하는 것은 자식타입의 객체를 부모 타입으로 사용하는 것을 말하며,
          이것은 자동 처리 된다.

          그러나 업캐스팅이 되면 자식의 원래의 속성과 기능을 사용할 수 없는 문제 발생

          따라서 자식이 원래 기능을 사용하려면 수동으로 다운캐스팅 해야 함.
         */


        System.out.println("================");
        Parent castingChild = new Child();
        // !! Child의 주소 값이 나옴
        System.out.println("castingChild" + castingChild);
        // !! Overriding한 Child 값이 나옴
        castingChild.parentMethod();
        // !!  원래 자기가 있넌 메소드는 접근이 안 됌
//        castingChild.childMethod();
        ((Child) castingChild).childMethod();


    }
}

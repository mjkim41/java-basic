package chap2_2.lang;

import java.util.Objects;

class Pen {
    long serial; // 펜 일련번호
    String color; // 색상
    int price; // 가격

    public Pen(long serial, String color, int price) {
        this.serial = serial;
        this.color = color;
        this.price = price;
    }

    // Object 클래스의 toString을 오버라이딩(재정의)
    //  -  원래는 주소값 보여주게 되어 있음
    //  -  보통 필드를 출력하게 오버라이딩 해 줌

    @Override
    public String toString() {
//        return "시리얼: " + serial + ", 색상: " + color + ", 가격: " + price;
        return String.format("시리얼: %s, 색상 : %s, 가격: %d원", serial, color, price);
    }

    // equals를 통해 모든 필드값이 같으면 두 객체를 같은 객체로 인식시키기
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null) return false;
//
//        Pen target = (Pen) o;
//        if (
//                this.serial == target.serial
//                && this.price == target.price
//                && this.color.equals(target.color)
//        ) {
//            return true;
//        } else{
//            return false;
//        }
//    }





    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;
        // Objects.equals() vs String.equals(String a) : String.equals(a)은 a이 null일 경우 예외를 반환
        return serial == pen.serial && price == pen.price && Objects.equals(color, pen.color);
    }





    @Override
    public int hashCode() {
        return Objects.hash(serial, color, price);
    }
}

public class OjbectSample {

    public static void main(String[] args) {
     Pen yellowPen = new Pen(100, "노랑", 1000);
     Pen bluePen = new Pen(200L, "파랑", 1200);
     Pen bluePen2 = new Pen(200L, "파랑", 1200);

        // System.out.println(object)하면 toString() 자동 실행
        //  => toString() 하면 해쉬코드 주소 나옴
        System.out.println("yellowPen =" + yellowPen);
        System.out.println("bluePen =" + bluePen);

        System.out.println("두 펜이 같은가?" + (bluePen == bluePen2));



    }


}

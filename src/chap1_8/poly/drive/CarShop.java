package chap1_8.poly.drive;

public class CarShop {

    // 돈을 주면 자동차를 출고하는 기능
    // !! public 다음에  Car로 받음!
     public Car exportCar(int money) {
         if (money == 6000) {
             return new Tesla();
         } else if (money == 4000) {
             return new Sonata();
         } else {
             return null;
         }
     }
}

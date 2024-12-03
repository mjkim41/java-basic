package chap1_8.poly.drive;

public class Main {

    public static void main(String[] args) {

        Sonata sonata1 = new Sonata();
        Car sonata2 = new Sonata();
        Sonata sonata3 = new Sonata();

        // 쏘나타를 배열에 저장
//        Sonata[] sonataList = {sonata1, sonata2, sonata3};
//
//        for (Sonata s : sonataList) {
//            s.accelerate();
//        }

        Tucson tucson1 = new Tucson();
        Car tucson2 = new Tucson();

//        Tucson[] tucsonList = {tucson1, tucson2};

        Tesla tesla1 = new Tesla();
        Car tesla2 = new Tesla();
        Car tesla3 = new Tesla();
        Car tesla4 = new Tesla();

//        Tesla[] teslaList = {tesla1, tesla2, tesla3, tesla4};

        // !! 다형성을 통해 동종모음 구조배열을
        // 이종모음 형태로 구현할 수 있다.
        // 자동 업캐스팅
        Car[] carList = {sonata1, tucson1, tesla2, sonata2};


        //  알아서 각각에 맞는 함수 실행됨
        for (Car car : carList) {
            car.accelerate();
        }

        System.out.println("==================");

        Driver midol = new Driver();
        midol.drive(tucson1);     // Driver 변수를 car로 해서 됨!!


        System.out.println("==================");

        CarShop shop = new CarShop();
        Car car = shop.exportCar(6000);
        car.accelerate();

        midol.drive(shop.exportCar(6000));


        System.out.println("=============");

        Sonata mySonata = new Sonata();
        mySonata.accelerate();
        mySonata.joinSonataClub();  // 여기서 Car로 수동으로 업캐스팅하면 원래 기능 못쓰니까

        // !!  알아서 업캐스팅 되는 걸 써라.
        Car[] cars = {mySonata};
        Car abc = mySonata;

        // !!  첫 줄 Sonata로  받으려면 수동 캐스팅 해야 함
        Sonata purchasedCar = (Sonata) shop.exportCar(3000);
        purchasedCar.accelerate();
        purchasedCar.joinSonataClub();

        int f = (int) foo();
    }

        static double foo() {
            return 9.9;

    }
}
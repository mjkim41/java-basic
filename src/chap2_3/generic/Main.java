package chap2_3.generic;

public class Main {

    public static void main(String[] args) {

        // ==== 제네릭을 사용하지 않았을 때 ==== //
        // 과일 전용바구니를 일일이 설계해야 함

        // 사과 바구니 생성
        AppleBasket appleBasket = new AppleBasket();
        appleBasket.setApple(new Apple(10));
        Apple apple = appleBasket.getApple();
        System.out.println("apple = " + apple);

        // 바나나 바구니 생성
        BananaBasket bananaBasket = new BananaBasket();
        bananaBasket.setBanana(new Banana(7));
        Banana banana = bananaBasket.getBanana();
        System.out.println("banana = " + banana);


        // ==== 제네릭을 사용했을 때 ==== //
        // 바구니 설계도는 딱 한개만 만들고, 바구니 생성 시 전용과일을
        Basket<Apple> ab = new Basket<Apple>();
        ab.setFruit(new Apple(33));
        Apple apple2 = ab.getFruit();

        Basket<Banana> bb = new Basket<>();
        bb.setFruit(new Banana((33)));
        Banana banana2 = bb.getFruit();
    }

}

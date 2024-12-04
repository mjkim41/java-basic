package chap1_10.abs;

public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("강아지가 초콜릿을 훔쳐 먹습니다.\n당장 막아요!");
    }

    @Override
    public void sleep() {
        System.out.println("강아지 잔다~~");
    }
}

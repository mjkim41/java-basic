package chap1_10.abs;

public class Cat extends Animal {

    public void eat() {
        System.out.println("고양이가 캣닢을 먹고 눈이 맑아졌어요");
    }

    @Override
    public void sleep() {
        System.out.println("냥냥이 잔다~~");
    }
}

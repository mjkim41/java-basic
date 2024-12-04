package chap1_10.abs;

public class Main {


    public static void main(String[] args) {

        Dog retriver = new Dog();
        Cat blackCat = new Cat();
        GoldFish goldFish = new GoldFish();

        Animal[] petList = {retriver, blackCat, goldFish};
        for (Animal animal : petList) {
            animal.eat();
            System.out.println("=========");
        }
    }
}

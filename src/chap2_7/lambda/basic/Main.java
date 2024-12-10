package chap2_7.lambda.basic;

public class Main {


    public static void order(Pet pet) {
        System.out.println("주인님의 명령입니다!");
        pet.eat();
        System.out.println("잘 먹었습니다");
    }

    public static void main(String[] args) {

        Pet dog = new Pet() {
            @Override
            public void eat() {
                System.out.println("강아지는 사료를 먹어요");
            }
        };




        order(dog);
        order(() -> System.out.println("금붕어는 플랑크톤을 먹어요"));

        System.out.println("========");
        order(() -> System.out.println("고양이는 생선을 냠냠냠"));

    }
}

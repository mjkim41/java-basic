package chap2_7.lambda;

import java.util.List;

import static chap2_7.lambda.Color.*;
import static chap2_7.lambda.FilterApple.*;
import static chap2_7.lambda.MappingApple.*;

public class Main {

    public static void main(String[] args) {
        // 사과 바구니 생성
        List<Apple> appleBasket = List.of(
                new Apple(80, GREEN)
                , new Apple(155, GREEN)
                , new Apple(120, RED)
                , new Apple(97, RED)
                , new Apple(200, GREEN)
                , new Apple(50, RED)
                , new Apple(85, YELLOW)
                , new Apple(75, YELLOW)
        );

        List<Apple> greenApples = filterGreenApples(appleBasket);
        System.out.println("greenApples = " + greenApples);

        System.out.println("===============");

        List<Apple> redApples = filterApplesByColor(appleBasket, RED);
        System.out.println("redApples = " + redApples);

        List<Apple> yellows = filterApplesByColor(appleBasket, YELLOW);
        System.out.println("yellows = " + yellows);


        System.out.println("=============");

        List<Apple> weightGT150 = filterApples(appleBasket, new AppleWeightPredicate());
        System.out.println("weightGT150 = " + weightGT150);

        // 빨강색이면서 무게가 150 미만인 사과를 필터링
//        List<Apple> applesSomethings = filterApples(appleBasket, new AppleSomething());
//        System.out.println("applesSomethings = " + applesSomethings);

        System.out.println("========");

        // 색상이 빨강색이거나 녹색인 사과를 필터링
        List<Apple> applesGorR = filterApples(appleBasket, new AppleGreenOrRed());
        System.out.println("applesGorR = " + applesGorR);

        // 빨강색이면서 무거운 (100 이상) 사과 필터링
        System.out.println("================");

        List<Apple> redHeavyApples = filterApples(appleBasket, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor() == RED && apple.getWeight() > 100;
            }
        });

        System.out.println("redHeavyApples = " + redHeavyApples);

        System.out.println("========");

        // 노랑색 사과만 필터링
        List<Apple> yellowApples = filterApples(appleBasket, (a) -> a.getColor() == YELLOW);
        System.out.println("yellowApples = " + yellowApples);

        System.out.println("========");

        // 숫자목록에서 짝수 필터링
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        List<Integer> filterNumbers = filter(numbers, n -> n % 2 == 0);
        System.out.println("filterNumbers = " + filterNumbers);

        List<String> foods = List.of("짜장면", "우동", "김", "탕수육");
        // f은 어디서 왔냐?
        // 아래에서 람다식은 아래와 같이 GenericPredicate를 상속받은 구체화된 객체를 만드는 것과 같음
        /* class newClass extends GenericPredicate {
            @Override
            public boolean test {
                return n % 2 == 0
            }
        }
        */
        List<String> filterFoods = filter(foods, f -> f.length() == 3);
        System.out.println("filterFoods = " + filterFoods);
        
        System.out.println("=========");

        List<Color> colorList = mappingApplesByColor(appleBasket);
        System.out.println("colorList = " + colorList);

        System.out.println("==========");

//        MappingApple.mappingApples(appleBasket, new AppleFunction<Integer>() {
//            @Override
//            public Integer apply(Apple apple) {
//                return apple.getWeight();
//            }
//        });

        List<Integer> weightList = mappingApples(appleBasket, apple -> apple.getWeight());
        System.out.println("weightList = " + weightList);

        System.out.println("========");

        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        List<Integer> mappingNums = mapping(nums, n -> n * 3);
        System.out.println("mappingNums = " + mappingNums);

    }

    // 내부 클래스
    private static class AppleGreenOrRed implements ApplePredicate {

        @Override
        public boolean test(Apple apple) {
            return apple.getColor() == RED || apple.getColor() == GREEN;
        }
    }

}

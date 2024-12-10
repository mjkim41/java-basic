package chap2_8.stream;

import java.util.Optional;
import java.util.function.Predicate;

import static chap2_8.stream.Menu.*;

public class Finding {

    public static void main(String[] args) {
        // anyMatch()
        // 요리 중 채식주의자가 먹을 수 있는 요리가 하나라도 있는지 여부
        boolean flag1 = menuList.stream()
//                .filter(d -> d.getType() == DishType.MEAT)
                .anyMatch(d -> d.isVegetarian());

        // allmATCH()
        System.out.println("flag1 = " + flag1);
        // 요리 중 모든 요리가 1000칼로리 미만입니까?
        boolean flag2 = menuList.stream()
                .allMatch(m -> m.getCalories() < 1000);
        System.out.println("flag2 = " + flag2);

        // 요리 중에 첫번째 발견된 생선 요리를 찾기
        Optional<Dish> firstFish = menuList.stream()
                .filter(m -> m.getType() == DishType.FISH)
                .findFirst();


        firstFish.ifPresent(fish -> System.out.println(fish.getName()));

    }
}
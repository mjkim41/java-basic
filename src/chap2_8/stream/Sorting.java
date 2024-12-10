package chap2_8.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static chap2_8.stream.DishType.*;
import static chap2_8.stream.Menu.*;
import static java.util.stream.Collectors.*;

public class Sorting {

    public static void main(String[] args) {

        // 육류 요리 중 칼로리가 낮은 순으로 정렬하기
        List<Dish> lowCalorieMeats = menuList.stream()
                .filter(m -> m.getType() == MEAT)
                .sorted(Comparator.comparing(d -> d.getCalories()))
                .collect(toList());

        lowCalorieMeats.forEach(System.out::println);

        System.out.println("==================");

        /*
        [ Collection, 배열의 정렬 : sorted() ]
         */
        // 메뉴들을 이름 내림차로 정렬 (zyx순)
        menuList.stream() // 1) sorted를 사용하기 위해서는 먼저 sorted 메서드를 내장하고 있는 stream 객체로 변환해줘야 한다.
                // 2) sorted(Comparator.comparing(Comparator c)로 정렬
                //    - 작동원리 : sorted 함수 내부 작동원리에 의하여,
                //               1) menuList의 각 데이터 요소를 가져와서
                //               2) 사용자가 오버라이딩한 Comparator.comparing() 메소드를 호출한 후
                //               3) return 값을 활용하여  정렬한다.
                .sorted(Comparator.comparing((Dish dish) -> dish.getName()).reversed())
                .collect(toList())
                .forEach(System.out::println);

        System.out.println("================");

        // 칼로리가 300이상인 요리 중 칼로리가 낮은 탑3를 필터링
        menuList.stream()
                .filter(m -> m.getCalories() >= 300)
                .sorted(Comparator.comparing(Dish::getCalories))
                .limit(3)
                .collect(toList())
                .forEach(System.out::println);

    }
}
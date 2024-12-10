package chap2_8.stream;


import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Filtering {
    public static void main(String[] args) {

        // 요리 메뉴중 채식주의자가 먹을 수 있는 요리만 필터링
        List<Dish> menuList = Menu.menuList;

        // 채식주의자들의 요리를 담을 새 리스트를 생성
//        List<Dish> vegetarianList = new ArrayList<>();

        // 필터링
//        for (Dish dish : menuList) {
//            if (dish.isVegetarian()) {
//                vegetarianList.add(dish);
//            }
//        }

        List<Dish> vegetarianList = menuList.stream() // 1. 데이터 소스 생성
                .filter(Dish::isVegetarian)// 2. 중간 연산
                .collect(toList());        // 3. 최종 연산

        // 반복문 처리
        vegetarianList.forEach(System.out::println);

        System.out.println("======================");

        // 메뉴 목록 중 육류이면서 600칼로리 미만인 요리 필터링
        List<Dish> meatLowCalories = menuList.stream()
                .filter((menu) -> menu.getType() == DishType.MEAT && menu.getCalories() < 600)
                .collect(toList());

        meatLowCalories.forEach(System.out::println);

        System.out.println("===========================");
        // 메뉴 목록에서 요리 이름이 4글자인 것만 필터링
        menuList.stream()
                .filter(menu -> menu.getName().length() == 4)
                .collect(toList())
                .forEach(System.out::println);

        System.out.println("===========================");

        // 300칼로리보다 큰 요리 중 앞에서 3개만 필터링

        // 1. 정석버전(원리 설명용)
        menuList.stream() // 1) filter, map 등의 기능을 사용하기 위해 stream 객체를 만들고
                // 2) stream 객체의 메소드인 map()을 활용. 이 때, 매개변수로는 Predicate  객체를 받음
                // (상세설명1) 이 때, 사용자가 predicate 객체를 새로 생성하면서 test 함수를 오버라이딩 하면
                .filter(new Predicate<Dish>() {
                    @Override
                    public boolean test(Dish dish) {
                        return dish.getCalories() > 300;
                    }
                }) // (상세설명2) filter() 함수의 내부 작동 원리에 따라, stream으로 만든 collection의 각 데이터 요소를 받아서
                  //            위에서 오버라이딩한 test() 메서드에 argument로 전달
                //              그렇게 해서 return 된 값을 바탕으로 내부 구현 원리에 따라 필터링 된 값만 반환함
                .limit(3)
                .collect(toList());

        // 2. 람다버전
        List<Dish> limit3 = menuList.stream()
                .filter(m -> m.getCalories() > 300)
                .limit(3) // 앞에서부터 3개 선택
                .collect(toList());

        limit3.forEach(System.out::println);

        System.out.println("===========================");
        // 300칼로리보다 큰 요리 중 처음 2개는 스킵하고 필터링
        List<Dish> skip2 = menuList.stream()
                .filter(m -> m.getCalories() > 300)
                .skip(2)
                .collect(toList());

        skip2.forEach(System.out::println);

        System.out.println("===============");

        List<Integer> numbers = List.of(1,2,1,3,3,2,4,4,4,1,2);

        // 숫자 리스트에서 짝수들만 필터링
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .distinct()  // 중복 제거
                .collect(toList());

        System.out.println("evenNumbers = " + evenNumbers);
    }

}
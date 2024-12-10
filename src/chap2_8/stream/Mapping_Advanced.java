package chap2_8.stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.function.Function;
import java.util.stream.Collectors;

import static chap2_8.stream.Menu.menuList;
import static java.util.stream.Collectors.toList;

public class Mapping_Advanced {

    public static void main(String[] args) {


        // ======== 요리 중에 요리이름과 칼로리만 추출해서 새로운 객체로 포장하여 배열에 담고싶음 ===== //
//        // 1. map를 만들어서 담는 버전
//        List<Object> menuDetails = menuList.stream()
//                .map(menu -> {
//                    Map<String, Object> menuMap = new HashMap<>();
//                    menuMap.put("menuName", menu.getName());
//                    menuMap.put("calories", menu.getCalories());
//                    return menuMap;
//                })
//                .collect(toList());
//
//        System.out.println("menuDetails = " + menuDetails);

        System.out.println("==================");

        // 1. 익명 클래스 버전
        List<DishDetail> collect = menuList.stream()
                .map(new Function<Dish, DishDetail>() {
                    @Override
                    public DishDetail apply(Dish dish) {
                        // dish.getCalories()와 dish.name()을 추출해야 되는데, 두 개를 한 번에 추출 불가
                        //  => 따라서, 두 정보를 담은 객체를 만들어서, 그 객체를 반환하도록 한다.
                        return new DishDetail(dish);
                    }
                })
                .collect(toList()); // 이걸 System.out.println()을 하면, 각 데이터 요소의 경우 toString()이 자동 적용된다.
        System.out.println(collect);


        // 2. 람다식 표헌
        List<SimpleDish> simpleDishes = menuList.stream()
                .map(menu -> new SimpleDish(menu))
                .collect(toList());

        simpleDishes.forEach(System.out::println);

        System.out.println("====================");



        /*
            요리 중에 500칼로리 이상의
            메뉴 이름들만 추출
         */
        List<String> highCaloriesNames = menuList.stream()
                .filter(m -> m.getCalories() >= 500)
                .map(m -> m.getName())
                .collect(toList());

        System.out.println("highCaloriesNames = " + highCaloriesNames);


        System.out.println("===============");

        /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰
            음식들을 필터링한 다음에 음식의 이름과 타입만
            추출해서 출력해주세요.

            단, 타입은 MEAT의 경우 육류라고 저장
            FISH는 어류라고 저장, OTHER 기타라고 저장
         */
        for (DishDetail dishDetail : menuList.stream()
                .filter(m -> m.getCalories() > 500)
//                .map((dish) -> new DishDetail(dish)) 와 같음
                .map(DishDetail::new)
                .collect(toList()))
            System.out.println(dishDetail);

        System.out.println("==================");

        // 요리의 총 칼로리 수 구하기
        int totalCalories = menuList.stream()
                .mapToInt(m -> m.getCalories())
                .sum();

        
        System.out.println("totalCalories = " + totalCalories);

        // 평균 칼로리 구하기
        double average = menuList.stream()
                .mapToInt(m -> m.getCalories())
                .average()
                .getAsDouble();

        menuList.stream()
                .mapToInt(m -> m.getCalories())
                .average()


        System.out.println("average = " + average);


    }

}

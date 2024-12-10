package chap2_8.stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static chap2_8.stream.Menu.*;
import static java.util.stream.Collectors.*;

// map: 리스트에서 원하는 데이터만 선택해서 추출
// original: [ {}, {}, {} ]
// filtering: [ {}, {} ]
// mapping: [ "", "" ]
public class Mapping {

    public static void main(String[] args) {


        /*
          [ stream().map() ]
          - 📜 stream() : filter, map 등의 기능을 사용하기 위해 stream 객체를 만들고
               map() : stream 객체의 메소드인 map()을 활용
          - 🔍 용도 : 데이터를 변환하거나(names.stream().map(String::toUpperCase)
                      객체의 속성을 추출할 때 사용
         */

        // ========= 요리의 이름들만 추출해서 매핑  ========

        // 1. 정석
        // 요리에 이름만 추출하고 싶다.
        //  1) Map()을 사용하기 위해, Map 메소드를 내장하는 stream 객체로 변환해준다.
        List<String> menuFinal = menuList.stream()
                // 2) map() 메소드를 오버라이딩 해준다. 이 때, 매개변수는 Function 클래스이다.
                .map(new Function<Dish, String>() {
                    @Override
                    public String apply(Dish dish) {
                        return dish.getName();
                    }
                    // 3) .collect(Collectors.toList()) 로 List로 변환해준다. (안할 시 주소만 출력됨)
                }).collect(Collectors.toList());

        // 2. 람다식으로 변경
        List<String> dishNameList = menuList.stream()
                .map((menu) -> menu.getName())
                .collect(toList());


        System.out.println("dishNameList = " + dishNameList);
        System.out.println(dishNameList.size());

        System.out.println("===================");

        List<String> browsers = List.of(
                "safari", "chrome", "ms edge",
                "opera", "firefox"
        );


        // ========== 배열의 각각의 길이 가져오기 ============= //
        // 1. 기본 식
        List<Integer> lengthList1 = browsers.stream()
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String a) {
                        return a.length();
                    }
                })
                .collect(toList());

        // 2. 람다식
        List<Integer> lengthList = browsers.stream()
                .map(b -> b.length())
                .collect(toList());

        System.out.println("lengthList = " + lengthList);

        List<Character> characterList = browsers.stream()
                .map(b -> b.charAt(0))
                .collect(toList());

        System.out.println("characterList = " + characterList);

        System.out.println("=====================");


    }
}
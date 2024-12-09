package chap2_7.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

// 사과중에 원하는 데이터만 추출해서 새리스트로 반환
public class MappingApple {

    // 사과의 색상만 추출
    public static List<Color> mappingApplesByColor(List<Apple> basket) {
        List<Color> colorList = new ArrayList<>();

        for (Apple apple : basket) {
            Color color = apple.getColor();
            colorList.add(color);
        }
        return colorList;
    }

    // 사과의 무게만 추출
    public static List<Integer> mappingApplesByWeight(List<Apple> basket) {
        List<Integer> weightList = new ArrayList<>();

        for (Apple apple : basket) {
            weightList.add(apple.getWeight());
        }
        return weightList;
    }

    // 사과의 특정 데이터를 추출
    public static <Y> List<Y> mappingApples(List<Apple> basket, AppleFunction<Y> func) {
        List<Y> mappedList = new ArrayList<>();

        for (Apple apple : basket) {
            mappedList.add(func.apply(apple));
        }
        return mappedList;
    }

    // 특정 객체의 특정 데이터를 추출
    public static <X, Y> List<Y> mapping(List<X> basket, Function<X, Y> func) {
        List<Y> mappedList = new ArrayList<>();

        for (X x : basket) {
            mappedList.add(func.apply(x));
        }
        return mappedList;
    }
}

package chap2_7.lambda;

import chap1_6.modi.pac1.A;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// 사과를 여러가지 방법으로 필터링
public class FilterApple {

    /**
     * @solution - try1: 사과바구니에서 색상이 녹색인 사과들만 필터링!
     * @param basket : 다양한 색상과 무게의 사과들이 들어있는 리스트
     * @return - basket안에서 녹색 사과들만 필터링해서 새 리스트에 담아서 반환
     * @problem - 만약에 다른 색깔의 사과를 필터링해야 한다면
     *             이 메서드로는 불가능하다
     */
    public static List<Apple> filterGreenApples(List<Apple> basket) {
        // 1. 녹색 사과들만 담을 새 바구니 생성
        List<Apple> greenBasket = new ArrayList<>();

        // 2. 반복문과 조건문을 통해 녹색 사과를 필터링
        for (Apple apple : basket) {
            if (apple.getColor() == Color.GREEN) {
                greenBasket.add(apple);
            }
        }
        return greenBasket;
    }

    /**
     * @solution - try2: 색상을 파라미터화하여 원하는 컬러의 사과를 필터링!
     * @param basket : 다양한 색상과 무게의 사과들이 들어있는 리스트
     * @param color : 원하는 색상
     * @return - basket안에서 녹색 사과들만 필터링해서 새 리스트에 담아서 반환
     * @problem - 만약 필터링 기준이 색상이 아니라면
     */
    public static List<Apple> filterApplesByColor(List<Apple> basket, Color color) {
        // 1. 녹색 사과들만 담을 새 바구니 생성
        List<Apple> greenBasket = new ArrayList<>();

        // 2. 반복문과 조건문을 통해 특정 색상의 사과를 필터링
        for (Apple apple : basket) {
            if (apple.getColor() == color) {
                greenBasket.add(apple);
            }
        }
        return greenBasket;
    }

    // 기능 (함수)를 파라미터화 할 수 있는가?
    // 함수를 전달할 수 없는 대신 객체를 전달하여 그 객체 안에 함수를 호출하는 식으로

    /**
     * @solution - try3: 동작(기능, 메서드)을 추상화시켜 파라미터화한다.
     * @problem - 필터링 대상이 사과가 아니라면
     */
    public static List<Apple> filterApples(List<Apple> basket, ApplePredicate a) {
        // 1. 필터링된 사과들만 담을 새 바구니 생성
        List<Apple> filteredBasket = new ArrayList<>();

        // 2. 반복문과 조건문을 통해 특정 조건의 사과를 필터링
        for (Apple apple : basket) {
            if (a.test(apple)) {
                filteredBasket.add(apple);
            }
        }
        return filteredBasket;
    }

    /**
     * @solution - try4 : 여러 객체들을 필터링할 수 있도록 제네릭을 사용
     */
    public static <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> filteredList = new ArrayList<>();
        for (T t : list) {
            if (p.test(t)) {
                filteredList.add(t);
            }
        }
        return filteredList;
    }

}

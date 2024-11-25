package chap1_2.function;

import java.util.Arrays;

public class MethodQuiz {

    static String[] foods = {"떡볶이", "치킨", "파스타"};

    // 1. foods 배열을 출력하는 메소드 만들기
    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    // 2. foods 배열에 새 음식을 추가하는 함수
    static void push(String newFoodName) {
        String[] temp = copy(1);
        temp[temp.length - 1] = newFoodName;
        foods = temp; // 주소값 이전
        temp = null; //   !  안해줘도 됨 (지역변수라서 함수 호출 끝나면 알아서 없어지니까)
    }

    // 2-1 :  foods  배열을 복사해서 배열 수 조절해서 반환하는 함수
    static String[] copy(int capacity) {
        String[] newSizeArray = new String[foods.length + capacity];

        // loopCount 따로 빼주는 이유는 pop 인 상황에서도 쓰기 위함임
        int loopCount = (capacity >= 0) ? foods.length : newSizeArray.length;
        for (int i = 0; i < loopCount; i++) {
            newSizeArray[i] = foods[i];
        }
        return newSizeArray;
    }

    // 3 :  특정 키워드가 있는지 확인해서 있으면 index를 주는 함수
    static int indexOf(String targetFoodName) {
        for (int i = 0; i < foods.length; i++) {
            if (targetFoodName.equals(foods[i])) {
                return i;
            }
        } // end for
        return -1;
    }

    // 4. !! foods 배열의 마지막 값을 지워주는 함수
    static String pop() {
        if (foods.length == 0) {
            System.out.println("더 이상 제거할 수 없습니다.");
            return null;
        }

        String deletedFood = foods[foods.length - 1];
        foods = copy(-1);
        return deletedFood;
    }

    // 5-1. 포함 여부 확인하기
    static boolean include(String targetFood) {
        return indexOf(targetFood) != -1;
    }

    // 5. remove()
    static void remove(String targetFood) {
        if (!include(targetFood)) return;

        for (int i = indexOf(targetFood); i < foods.length - 1; i++) {
            foods[i] = foods[i + 1];
        }

        pop();
    }

    // 5-2 오버 로딩: 같은 이름으로 함수를 여러 개 만드는 기능
    static void remove(int index) {
        String foodName = foods[index];
        remove(foodName);
    }

    // 6. insert

    static boolean isOutOfBounds(int index) {
        return index < 0 || index >= foods.length;
    }

    static void insert(int index, String newFoodName) {
        if (isOutOfBounds(index)) return;
        String[] temp = copy(1);

        for (int i = foods.length; i > index; i--) {
            temp[i] = temp[i - 1];
        }
        temp[index] = newFoodName;
        foods = temp;
    }

    // 7. modify
    static void modify(int index, String newFoodName) {
        if (isOutOfBounds(index)) return;
        foods[index] = newFoodName;
    }


    public static void main(String[] args) {

        // 1 번 문제
        printFoods();

        // 2번 문제
        push("라면");
        push("김치찌개");
        printFoods();

        // 3번 문제
        int index = indexOf("파스타");
        System.out.println("index = " + index);

        // 4번 문제
        pop();
        pop();
        printFoods();

        // 5 번 문제
        System.out.println("5번");
        remove("치킨");
        remove(0);
        printFoods();

        // 6 번 문제
        boolean flag1 = include("파스타");
        System.out.println("flag1 = " + flag1);

        boolean flag2 = include("떡라면");
        System.out.println("flag2 = " + flag2);

        insert(3, "파인애플");
        printFoods();

        modify(2, "닭갈비");
        printFoods();
    }
}


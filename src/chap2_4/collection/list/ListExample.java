package chap2_4.collection.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        // !! <> 안할수도 있음
        ArrayList<String> hobbies = new ArrayList<>();
        hobbies.add("수영");
        hobbies.add("낮잠");
        hobbies.add("아이스크림 먹기");
        hobbies.add("조퇴하기");

        System.out.println(hobbies);

        // !! 중간 삽입
        hobbies.add(1, "코딩");
        System.out.println(hobbies);

        // !! 데이터 수 확인
        int size = hobbies.size();
        System.out.println("size = " + size);


        // !! 인덱스 찾기
        int index1 = hobbies.indexOf("영화감상");
        System.out.println(index1);

        // !! 요소 포함 여부
        boolean flag = hobbies.contains("코딩");
        System.out.println("flag = " + flag);

        // !!요소 삭제
        hobbies.remove("수영");
        hobbies.remove(2);
        System.out.println(hobbies);

        // !! 요소 수정
        hobbies.set(0, "디자인");
        System.out.println(hobbies);


        // !! 요소 참조
        String hobby = hobbies.get(1);
        System.out.println("hobby :" + hobby);

        // 리스트의 순회(반복문 처리)
//        for (int i = 0; i < hobbies.size(); i++) {
//            System.out.println(hobbies.get(i));
//        }

        for (String s : hobbies) {
            System.out.println("s = " + s);
        }


        hobbies.forEach(h -> System.out.println("h =" + h));

        // 전제 삭제
        hobbies.clear();
        System.out.println(hobbies);

        // 비었는지 확인
        System.out.println(hobbies.isEmpty());

        // 리스트에 초기값 넣고 시작하기 (primivate type 안 됨)
        List<Integer> numbers = new ArrayList<>(List.of(10, 20, 30));
        numbers.add(100);
        System.out.println(numbers);
    }
}

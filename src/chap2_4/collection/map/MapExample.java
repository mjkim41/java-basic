package chap2_4.collection.map;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {

        // HashMap : 순서 보장 X, 빠른 조회
        Map<String, Object> map = new HashMap<>();

        /*
              "empName": "김철수",
              "hireDate" : "2012-03-15",
              "salary" : 5000000,
         */

        // 데이터 추가 : put
        map.put("empName", "김철수");
        map.put("hireDate", LocalDate.of(2012, 3, 15));
        map.put("salary", 5000000);

        System.out.println(map);
        System.out.println(map.size()); // key값 만큼 출력됨(3)

        // 맵에 있는 데이터 꺼내기
        String empName = (String) map.get("empName"); // 다운캐스팅
        System.out.println("empName = " + empName);

        int salary = (int) map.get("salary");

        // 중복된 키를 사용해서 생성하면 수정으로 처리
        map.put("empName", "박영희"); // 김철수를 박영희로 수정
        System.out.println(map);

        // 맵의 순회 : iterable 적용 안 됨
        Set<String> keys = map.keySet(); // map에서 key만 추출

        for (String key : keys) {
            System.out.println("key = " + key);
            System.out.println("value = " + map.get(key));
        }


    }
}

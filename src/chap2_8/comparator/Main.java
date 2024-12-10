package chap2_8.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.*;

public class Main {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("김철수", 15, 79));
        studentList.add(new Student("박영희", 13, 41));
        studentList.add(new Student("고길동", 17, 11));
        studentList.add(new Student("도우너", 19, 34));

        //{ [<student>, <student>] }
        // List를 오름 차순으로 정렬할 때 : List.sort(Comparator c), List.sort(Comparator.comparing())

        // 1. 정석버전
        //   - sort의 parameter값인 new Comparator을 만들고,
        //     Comparator.compare() 메소드를 오버라이딩 한다
        studentList.sort(new Comparator<Student>() {
            // sort 함수의 내부 구현 코드에 의해서, 1) studentLilst를 순회하면서 배열을 순서대로 돌면서 Student 객체를 가져와서
            @Override
            // 2) if (compare() > 0) 이면 정렬 순서를 바꾼다.
            public int compare(Student o1, Student o2) {
                return  o1.getAge() - o2.getAge();
            }
        });

        // 2. 위 식을 람다식으로 표현(성능을 같으며, 보이기에만 더 깔끔)
        studentList.sort((o1, o2) -> o1.getAge() - o2.getAge());

        // 3. 식이 복잡할 떄 : .sort(Comparator.comparing())
        studentList.sort(Comparator.comparing((student) -> student.getAge()));

        // 4. 위 식을 ::로 표현
        studentList.sort(Comparator.comparing(Student::getAge));

//        studentLlist.forEach((Student student) -> System.out.println(student);
        studentList.forEach(System.out::println);

        studentList.sort(Comparator.comparing(Student::getAge));




        // 내림차순 정렬은? sort(comparing())뒤에 reversed()를 붙이면 된다
        // 나이 내림차 - 나이 많은 순
        System.out.println("====================");
        studentList.sort(comparing(Student::getAge).reversed());
        studentList.forEach(System.out::println);


        // 이름 오름차 - 가나다순
        System.out.println("====================");
        studentList.sort(Comparator.comparing(Student::getName));
        studentList.forEach(System.out::println);

    }
}

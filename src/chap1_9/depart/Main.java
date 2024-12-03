package chap1_9.depart;

public class Main {

    public static void main(String[] args) {

        Department comSci = new Department("컴공과", 200);
        Department spanish = new Department("스페인어과", 140);
        Department urdu = new Department("우르두어", 120);
        Department arabic = new Department("아랍어", 220);

        // 동적 메서드는 객체 생성 후 사용해야 함
        // addStudent();
        spanish.addStudent(20);

        System.out.println("전체 학생 수 : " + Department.getTotalStudentCount());
    }
}

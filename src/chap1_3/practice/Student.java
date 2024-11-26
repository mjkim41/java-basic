package chap1_3.practice;

import java.util.UUID;

public class Student  {

    String studentId;
    String name;
    int grade;

    //     학생 정보 생성할 떄 필요한 정보를 내놔라
    Student(String name, String studentId, int grade) {
        this.name = UUID.randomUUID().toString(); //!! UUID.randomUUID() : 고유 식별자(하이픈 포함 32자리)
        this.studentId = studentId;
        this.grade = grade;
    }

    Student(String name, int grade) {
        this.name = name;
        this.studentId = UUID.randomUUID().toString();
        this.grade = grade;
    }

    void updateGrade(int newGrade) {
        grade = newGrade;
        System.out.printf("%d학년으로 수정 완료\n", grade);
    }



    void printStudentInfo() {
        System.out.printf("== 학생 정보 == \n 이름 : %s \n 학생증 번호 : %s \n 학년 : %d", name, studentId, grade);
    }
}

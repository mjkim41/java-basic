package chap1_3;

public class Student  {

    int studentId;
    String name;
    int grade;

    Student(String name, int studentId, int grade) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
    }

    int updateGrade(int newGrade) {
        grade = newGrade;
        return grade;
    }

    void printStudentInfo() {
        System.out.printf("== 학생 정보 == \n 이름 : %s \n 학생증 번호 : %d \n 학년 : %d", name, studentId, grade);
    }
}

package chap1_3;

public class StudentMain {

    public static void main(String[] args) {

        Student mj = new Student("김미정",201000386,10);
        mj.updateGrade(3);
        mj.printStudentInfo();
    }
}

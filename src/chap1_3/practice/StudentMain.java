package chap1_3.practice;

public class StudentMain {

    public static void main(String[] args) {

        Student kim = new Student("김초코", 4);

        kim.updateGrade(2);

        kim.printStudentInfo();

    }
}
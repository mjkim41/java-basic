package chap1_9.depart;

public class Department {


    // 어떤 거가 static?
    private String departmentName;
    private int studentCount; // 학과 학생 수
    static private int totalStudentCount; // 모든 학과 학생 수 총합

    public Department(String departmentName, int studentCount) {
        this.departmentName = departmentName;
        this.studentCount = studentCount;
        totalStudentCount =+ studentCount;
    }

    // 학생 수를 추가하는 메서드
    public void addStudent(int number) {
        studentCount += studentCount;
        totalStudentCount += number;
    }

    // 학과 학생 수를 조회하는 메서드
    public int getStudentCount() {
        return studentCount;
    }

    // 모든 학과 학생 수를 조회하는 메서드
    public static int getTotalStudentCount() {
        return totalStudentCount;
    }
}

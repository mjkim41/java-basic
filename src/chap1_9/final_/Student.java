package chap1_9.final_;

public class Student {

    public String name;
    public final String ssn; // 주민번호
//    public final String nation; // 생성자에서 초기화 안 했으므로 사용 불가

    public Student(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
